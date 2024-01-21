// JavaScript source code
document.addEventListener('DOMContentLoaded', function () {
  var checkPageButton = document.getElementById('submit');
  checkPageButton.addEventListener('click', function () {
    var TabsCollection;

    chrome.tabs.query({
      currentWindow: true
    }, function (arrayOfTabs) {
      TabsCollection = arrayOfTabs;
    });

    var dt = new Date();
    var folderName = "" + dt.getFullYear() + dt.getMonth() + dt.getDate() + "-" + dt.getHours() + dt.getMinutes() + dt.getSeconds() + dt.getMilliseconds();

    chrome.bookmarks.create({
        'title': folderName
      },
      function (newFolder) {
        for (var i = 0; i < TabsCollection.length; i++) {
          chrome.bookmarks.create({
            'parentId': newFolder.id,
            'url': TabsCollection[i].url,
            'title': TabsCollection[i].title
          });
          if (document.getElementById('ckeckId').checked == false) {
            chrome.tabs.remove(TabsCollection[i].id);
          }
        }
      }
    );
    var myWindow = window.open("", "_self");
    myWindow.close();
  }, false);
}, false);
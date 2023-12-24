#include <iostream>
#include <fstream>
#include <string>
#include <time.h>
using namespace std;

char place[10] = { 'o','1','2','3','4','5','6','7','8','9' }; //the board used in dual mode.
int point = 0; //point for player 1.
int point2 = 0; //point for player 2.
string str; //name of the first player.
string str2; //name of the second player.
int min(int board[9]);
int max(int board[9]);
int point3 = 0; //point of player in single player mode.
int point4 = 0; //points for the AI.
int draw_count = 0; //counts of how many times you have gotten a draw in single mode.
string str3; //name of player in single player mode.
string a[9] = { { "0" },{ "1" },{ "2" },{ "3" },{ "4" },{ "5" },{ "6" },{ "7" },{ "8" } }; //the board used in single mode for seeing 0 to 8 on board.
string b[9] = { { "0" },{ "1" },{ "2" },{ "3" },{ "4" },{ "5" },{ "6" },{ "7" },{ "8" } }; //just a copy used for furning the board to default mode.

int random() { //random player.
	srand(time(0));
	return 1 + rand() % 2;
}

void stop() { //just for making it look better.
	cout << endl;
	system("pause");
	cout << endl;
}

void home_page() {
	cout << "\n\t\t   HOME PAGE\n\n1. start game.\n\n2. winners.\n\n3. exit.\n\nplease insert the number then press enter: ";
}

bool check(int n) { //cheking the enteries for main page.
	if (1 > n || n > 3) {
		cout << "you have entered the wrong number please try again.\n";
		return false;
	}
	else
		return true;
}

bool check2(int n) { //checks if the block you have chosen is in the chouses.
	if (0 > n || n > 8) {
		cout << "that an invalid move try again: ";
		return false;
	}
	else
		return true;
}

bool check3(int n, int board[9]) { //checks if the block you have chosen hasn't bean chosen yet.
	if (board[n] == 0) {

		return true;
	}
	else {
		cout << "that an invalid move try again: ";
		return false;
	}
}

void add_winner(string name, int points, int chouse) { //addes winners to the txt file.
	if (chouse == 1) { //for single mode.
		ofstream duzFile("duz.txt", ios::app);
		if (duzFile.is_open()) {
			duzFile << name << "___(" << points << ")" << endl;
			duzFile.close();
		}
		else {
			cout << "\nerrer.\n";
		}
	}
	if (chouse == 2) { //for dual mode.
		ofstream duzFile2("duz2.txt", ios::app);
		if (duzFile2.is_open()) {
			duzFile2 << name << "___(" << points << ")" << endl;
			duzFile2.close();
		}
		else {
			cout << "\nerrer.\n";
		}
	}
}

bool checking_winner(int board[9]) { //cheking for winner for single mode.
	if ((board[0] == board[1] && board[1] == board[2] && board[0] != 0) ||
		(board[3] == board[4] && board[4] == board[5] && board[4] != 0) ||
		(board[6] == board[7] && board[7] == board[8] && board[6] != 0)) {
		return true;
	}
	else if ((board[0] == board[3] && board[3] == board[6] && board[0] != 0) ||
		(board[1] == board[4] && board[4] == board[7] && board[4] != 0) ||
		(board[2] == board[5] && board[5] == board[8] && board[2] != 0)) {
		return true;
	}
	else if ((board[0] == board[4] && board[4] == board[8] && board[4] != 0) ||
		(board[2] == board[4] && board[4] == board[6] && board[4] != 0)) {
		return true;
	}
	else {
		return false;
	}
}

int checking_winner2() { //cheking for winner and tie and playing for doul mode.
	if (place[1] == place[2] && place[2] == place[3]) {
		return 1;
	}
	else if (place[4] == place[5] && place[5] == place[6]) {
		return 1;
	}
	else if (place[7] == place[8] && place[8] == place[9]) {
		return 1;
	}
	else if (place[1] == place[4] && place[4] == place[7]) {
		return 1;
	}
	else if (place[2] == place[5] && place[5] == place[8]) {
		return 1;
	}
	else if (place[3] == place[6] && place[6] == place[9]) {
		return 1;
	}
	else if (place[1] == place[5] && place[5] == place[9]) {
		return 1;
	}
	else if (place[3] == place[5] && place[5] == place[7]) {
		return 1; //you win.
	}
	else if (place[1] != '1' && place[2] != '2' && place[3] != '3'
		&& place[4] != '4' && place[5] != '5' && place[6] != '6'
		&& place[7] != '7' && place[8] != '8' && place[9] != '9') {
		return 0; //tie.
	}
	else {
		return -1; //still playing.
	}
}

bool cheking_draw(int board[9]) { //checks if it's a draw for single mode.
	int count = 0;
	for (int i = 0; i<9; i++) {
		if (board[i] != 0) { //all the blocks are oginaly filled with 0. 
			count++;         //and so i'm only looking if each block of the board has a 0 or not.
		}
	}
	if (count == 9) {
		return true;
	}
	else {
		return false;
	}
}

void board1() { //displays the board for single player mode.
	system("cls");
	system("Color F4");
	cout << str3 << "(" << point3 << ")\tAI(" << point4 << ")\n._-_-_-_-_-_-_-_-_.\n|     |     |     |\n|  " << a[0] << "  |  " << a[1] << "  |  " << a[2] << "  |  \n|_____|_____|_____|\n|     |     |     |\n|  " << a[3] << "  |  " << a[4] << "  |  " << a[5] << "  |  \n|_____|_____|_____|\n|     |     |     |\n|  " << a[6] << "  |  " << a[7] << "  |  " << a[8] << "  |  \n|     |     |     |\n^-_-_-_-_-_-_-_-_-^\n\n";

}

void board2() { //displays the board for dual player mode.
	system("cls");
	system("Color F4");
	cout << str << "(" << point << ")\t" << str2 << "(" << point2 << ")\n._-_-_-_-_-_-_-_-_.\n|     |     |     |\n|  " << place[1] << "  |  " << place[2] << "  |  " << place[3] << "  |  \n|_____|_____|_____|\n|     |     |     |\n|  " << place[4] << "  |  " << place[5] << "  |  " << place[6] << "  |  \n|_____|_____|_____|\n|     |     |     |\n|  " << place[7] << "  |  " << place[8] << "  |  " << place[9] << "  |  \n|     |     |     |\n^-_-_-_-_-_-_-_-_-^\n\n";
}

void input_board(int board[9]) { //puts inputs in board.

	for (int i = 0; i<9; i++) {
		if (board[i] == 1) { //each block that is orderd to be x shows x.
			a[i] = "X";
		}
		else if (board[i] == -1) { //each block that is orderd to be o shows o.
			a[i] = "O";
		}

	}
}

void clear_Board() { //clears the board for single mode and makes it look empty.

	for (int i = 0; i<9; i++) {
		a[i] = b[i];
	}
}

int max(int board[9]) {
	if (cheking_draw(board)) {
		return 0; //gives the neutral score of 0 if it gets a draw.
	}
	else if (checking_winner(board)) {
		return -1000; //gives the lowest score of -1000 if it gets a win.
	}
	int finalscore = -1000;
	for (int i = 0; i < 9; i++) {
		if (board[i] == 0) {
			board[i] = 1;
			int score = min(board);
			if (score > finalscore) {
				finalscore = score;
			}
			board[i] = 0;
		}
	}
	return finalscore;
}

int min(int board[9]) {
	if (cheking_draw(board)) {
		return 0; //gives the neutral score of 0 if it gets a draw.
	}
	else if (checking_winner(board)) {
		return 1000; //gives the highst score of 1000 if it gets a win.
	}
	int finalscore = 1000;
	for (int i = 0; i < 9; i++) {
		if (board[i] == 0) { //loops though the bord and looks for empty blocks of board.
			board[i] = -1; //-1 is the AIs move and puts O in that block of board.
			int score = max(board); //checking with max witch does pretty much the same thing as min() just with the lowest score.
			if (score < finalscore) { //if the final score of max() is less than min() final score the final score of max() will be put in min() final score.
				finalscore = score;
			}
			board[i] = 0;
		}
	}
	return finalscore;
}

void AI_playing(int board[9], int player) {  //we enter the board though the left one and though the right one
	int finalScore = player * -1000; //we tell it the number that symbolises the players moves and the players mark in the game in ths case it is -1 that is O.
	int position;
	for (int i = 0; i < 9; i++) {
		if (board[i] == 0) { //loops though the bord and looks for empty blocks of board.
			board[i] = player;
			int score;
			if (player == 1) { //if the player was number 1 or X. 
				score = min(board);
			}
			else {
				score = max(board); //the score that the player can get.
			}
			if (player == 1 && score >= finalScore) {
				finalScore = score;
				position = i;
			}
			else if (player == -1 && score <= finalScore) { //if AI_playing() final score is more or equal to max()s score.
				finalScore = score;
				position = i; //saves the position of the board in witch such a thing happend.
			}
			board[i] = 0;
		}
	}

	board[position] = player;
}

void enter_name() { //entering name for single mode.
	system("cls");
	cout << "enter your name: ";
	cin >> str3;
}

void single_mode() { //single player mode.
	int player = random(), temp = 1, temp2 = 1;
	int matrix[9] = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	int tempp[9] = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	int n, round = 1;

	if (round == 1 && point3 + point4 + draw_count == 0) {
		player = random();
		if (player == 1) {
			player = 1;
			temp2 = 1;
		}
		if (player == 2) {
			player = 2;
			temp2 = 2;
		}
	}

	do {
		if (player % 2 == 0 && player < 9) { //calling the AI to play (O).
			player = -1;

			AI_playing(matrix, player);
			input_board(matrix);
			board1();
			cout << endl;

			if (checking_winner(matrix) == true) {
				point4++;
				round++;
				if (point3 + point4 + draw_count == 5) {
					if (point3 > point4) {
						system("Color F2");
						cout << "(" << str3 << ") IS THE WINNER.\n";
						add_winner(str3, point3, temp);
						round = 0;
						stop();
						break;
					}

					if (point3 < point4) {
						system("Color F4");
						cout << "(AI) IS THE WINNER.\n";
						round = 0;
						stop();
						break;
					}
					if (point3 == point4 && draw_count < 5) {
						system("Color F2");
						cout << "IT'S A DRAW.\n";
						round = 0;
						stop();
						break;
					}
				}
				else {
					stop();
					break;
				}
			}

			else if (cheking_draw(matrix) == true) {
				round++;
				draw_count++;
				if (draw_count == 5) { //if it has bean a draw 5 times in a row and the player has started the game.
					system("Color F2");
					cout << "(" << str3 << ") IS THE WINNER.\n";
					add_winner(str3, point3, temp);
					round = 0;
					stop();
					break;
				}
				else {
					stop();
					break;
				}
			}

			input_board(matrix);
			board1();
			cout << endl;
		}
		else if (player % 2 != 0) { //player 1 (X).
			input_board(matrix);
			board1();
			cout << endl;

			cout << str3 << " enter a number:  ";
			do {
				cin >> n;
			} while (check2(n) == false || check3(n, matrix) == false); //checking if entery is coerct if not trying another entery.
			matrix[n] = 1;

			input_board(matrix);
			board1();
			cout << endl;

			if (checking_winner(matrix) == true) {
				point3++;
				round++;
				if (point3 + point4 + draw_count == 5) {
					if (point3 > point4) {
						system("Color F2");
						cout << "(" << str3 << ") IS THE WINNER.\n";
						add_winner(str3, point3, temp);
						round = 0;
						stop();
						break;
					}

					if (point3 < point4) {
						system("Color F4");
						cout << "(AI) IS THE WINNER.\n";
						round = 0;
						stop();
						break;
					}
					if (point3 == point4 && draw_count < 5) {
						system("Color F2");
						cout << "IT'S A DRAW.\n";
						round = 0;
						stop();
						break;
					}
				}
				else {
					stop();
					break;
				}
			}

			else if (cheking_draw(matrix) == true) {
				round++;
				draw_count++;
				if (draw_count == 5) { //if it has bean a draw 5 times in a row and the AI has started the game.
					system("Color F4");
					cout << "(AI) IS THE WINNER.\n";
					round = 0;
					stop();
					break;
				}
				else {
					stop();
					break;
				}
			}
			player++; //so that it becomes the AIs turn next.
		}
	} while (0 <= round && round <= 5);

	for (int j = 0; j < 9; j++) {
		matrix[j] = tempp[j];
	}
	clear_Board();
	if (round > 1 && round < 5) { //a recursive function that activates untill the game has a winner or ends with a draw.
		single_mode();
	}
	else if (round == 0) { //reseting to defaults after last round.
		round = 1;
		point3 = 0;
		point4 = 0;
		draw_count = 0;
	}
}

void dual_mode() { //two player mode.
	int player = random(), choice, round = 1, draw_count2 = 0, temp = 2;
	char input;
	system("cls");
	cout << "player 1 enter your name: ";
	cin >> str;
	cout << "player 2 enter your name: ";
	cin >> str2;

	do { //for playing 5 times.
		do {
			board2();

			if (player % 2 == 0) {
				player = 2;
				input = 'O';
			}
			else {
				player = 1;
				input = 'X';
			}

			if (player == 1) {
				cout << str << " enter a number:  ";
			}
			if (player == 2) {
				cout << str2 << " enter a number:  ";
			}

			cin >> choice; //choosing wich place in to put input.

			if (place[1] == '1' && choice == 1) {
				place[1] = input; //puting x or o in boxes.
			}
			else if (place[2] == '2' && choice == 2) {
				place[2] = input;
			}
			else if (place[3] == '3' && choice == 3) {
				place[3] = input;
			}
			else if (place[4] == '4' && choice == 4) {
				place[4] = input;
			}
			else if (place[5] == '5' && choice == 5) {
				place[5] = input;
			}
			else if (place[6] == '6' && choice == 6) {
				place[6] = input;
			}
			else if (place[7] == '7' && choice == 7) {
				place[7] = input;
			}
			else if (place[8] == '8' && choice == 8) {
				place[8] = input;
			}
			else if (place[9] == '9' && choice == 9) {
				place[9] = input;
			}
			else {
				cout << "\nthat an invalid move try again: ";

				player--; //so that the same player gets to try again.
				cin.ignore(); //so that you can see the warning above on terminal.
				cin.get();
			}
			player++;
		} while (checking_winner2() == -1); //while im still playing.


		if (checking_winner2() == 1) { //winner.
			if (player == 2) { //this is the player with X or the first person that the name was enterd.
				point++;
			}
			if (player == 3) { //this is the player with O or the second person that the name was enterd.
				point2++;
			}
		}
		else { //tie.
			draw_count2++;
			if (draw_count2 == 5) { //if it's a tie 5 times in a row.
				if (player == 2) {
					board2();
					system("Color F2");
					cout << "(" << str2 << ") IS THE WINNER.\n";
					add_winner(str2, point2, temp);
					stop();
				}
				if (player == 3) {
					board2();
					system("Color F2");
					cout << "(" << str << ") IS THE WINNER.\n";
					add_winner(str, point, temp);
					stop();
				}
			}
		}

		if (round == 5) { //the winner after 5 rounds.
			if (point > point2) {
				board2();
				system("Color F2");
				cout << "(" << str << ") IS THE WINNER.\n";
				add_winner(str, point, temp);
				stop();
			}
			if (point < point2) {
				board2();
				system("Color F2");
				cout << "(" << str2 << ") IS THE WINNER.\n";
				add_winner(str2, point2, temp);
				stop();
			}
			else if (point == point2 && draw_count2 < 5) {
				board2();
				system("Color F2");
				cout << "IT'S A DRAW.\n";
				stop();
			}
		}
		place[1] = '1';
		place[2] = '2';
		place[3] = '3';
		place[4] = '4';
		place[5] = '5';
		place[6] = '6';
		place[7] = '7';
		place[8] = '8';
		place[9] = '9';
		round++;
	} while (round < 6);
	round = 1; //this part is to reset the value to default after 5 rounds.
	draw_count2 = 0;
	point = 0;
	point2 = 0;
}

void start() { //start game.
	int n;
	system("cls");
	cout << "\n1. single player mode.\n\n2. two player mode.\n\n3. return to home page.\n\nplease insert the number then press enter: ";

	do { //checking if the entry is between 1 and 3.
		cin >> n;
	} while (check(n) == false);

	if (n == 1) {
		enter_name();
		single_mode();
	}
	if (n == 2) {
		dual_mode();
	}
}

void winner() { //list of winners.
	string name;
	int n;
	system("cls");
	cout << "\n1. winner list for single player mode.\n\n2. winner list for two player mode.\n\n3. return to home page.\n\nplease insert the number then press enter: ";

	do { //checking if the entry is between 1 and 3.
		cin >> n;
	} while (check(n) == false);

	if (n == 1) { //list of winners for single player mode.
		ifstream duzFile("duz.txt", ios::in);
		if (!duzFile) {
			system("cls");
			cout << "\nthere are no winners in single mode yet.\n";
			duzFile.close();
		}
		else {
			int v = 1;
			system("cls");
			ifstream duzFile("duz.txt", ios::in);
			while (getline(duzFile, name)) {
				system("Color B4");
				cout << "\n#" << v << ") { [" << name << "] }" << endl;
				v++;
			}
			duzFile.close();
		}
		stop();
	}
	if (n == 2) { //list of winners for dual player mode.
		ifstream duzFile2("duz2.txt", ios::in);
		if (!duzFile2) {
			system("cls");
			cout << "\nthere are no winners in single mode yet.\n";
			duzFile2.close();
		}
		else {
			int v = 1;
			system("cls");
			ifstream duzFile2("duz2.txt", ios::in);
			while (getline(duzFile2, name)) {
				system("Color B4");
				cout << "\n#" << v << ") { [" << name << "] }" << endl;
				v++;
			}
			duzFile2.close();
		}
		stop();
	}
}

void home() {
	int n;
	system("Color E1");
	cout << "\t*********************************\n\t welcome to the tic tac toe game \n\t*********************************\n";
	stop();
	while (1) {
		system("Color F0");
		system("cls");
		home_page(); //the text in the home page.

		do { //checking if the entry is between 1 and 3.
			cin >> n;
		} while (check(n) == false);

		if (n == 1) {
			system("cls");
			start();
			if (n == 3) {
				break;
			}
		}
		if (n == 2) {
			system("cls");
			winner();
			if (n == 3) {
				break;
			}
		}
		if (n == 3) {
			system("cls");
			break;
		}
	}
}

int main()
{
	home();
}

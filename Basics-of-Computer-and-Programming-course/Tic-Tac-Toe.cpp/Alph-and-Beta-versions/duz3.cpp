// duz3.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <iostream>
#include <fstream>
#include <string>
#include <time.h>
using namespace std;

char place[10] = { 'o','1','2','3','4','5','6','7','8','9' };
int point = 0; //point for player 1.
int point2 = 0; //point for player 2.
string str; //name of the first player.
string str2; //name of the second player.
ofstream duzFile; //the object to put text in txt fie.
int min(int board[9]);
int max(int board[9]);
int point3 = 0; //point of player in single player mode.
int point4 = 0; //points for the AI.
string str3; //name of player in single player mode.
string a[9] = { { "0" },{ "1" },{ "2" },{ "3" },{ "4" },{ "5" },{ "6" },{ "7" },{ "8" } }; //the board just for show.
string b[9] = { { "0" },{ "1" },{ "2" },{ "3" },{ "4" },{ "5" },{ "6" },{ "7" },{ "8" } }; //just a copy.
int c = 0;


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

bool check2(int n) { //cheking the enteries for main page.
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
	cout << str3 << "(" << point3 << ")\tAI(" << point4 << ")\n._-_-_-_-_-_-_-_-_.\n|     |     |     |\n|  " << a[0] << "  |  " << a[1] << "  |  " << a[2] << "  |  \n|_____|_____|_____|\n|     |     |     |\n|  " << a[3] << "  |  " << a[4] << "  |  " << a[5] << "  |  \n|_____|_____|_____|\n|     |     |     |\n|  " << a[6] << "  |  " << a[7] << "  |  " << a[8] << "  |  \n|     |     |     |\n^-_-_-_-_-_-_-_-_-^\n\n";

}

void board2() { //displays the board for dual player mode.
	system("cls");
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
		return 0;
	}
	else if (checking_winner(board)) {
		return -1000;
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
		return 0;
	}
	else if (checking_winner(board)) {
		return 1000;
	}
	int finalscore = 1000;
	for (int i = 0; i < 9; i++) {
		if (board[i] == 0) {
			board[i] = -1;
			int score = max(board);
			if (score < finalscore) {
				finalscore = score;
			}
			board[i] = 0;
		}
	}
	return finalscore;
}

void AI_playing(int board[9], int player) {
	int finalScore = player * -1000;
	int position;
	for (int i = 0; i < 9; i++) {
		if (board[i] == 0) {
			board[i] = player;
			int score;
			if (player == 1) {
				score = min(board);
			}
			else {
				score = max(board);
			}
			if (player == 1 && score >= finalScore) {
				finalScore = score;
				position = i;
			}
			else if (player == -1 && score <= finalScore) {
				finalScore = score;
				position = i;
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
	int player = random(), temp;
	int matrix[9] = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	int tempp[9] = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	int n, round = 1, draw_count = 0;

	do {
		if (player % 2 == 0 && player < 9) { //calling the AI to play (O).
			player = -1;
			temp = 2;

			AI_playing(matrix, player);
			input_board(matrix);
			board1();
			cout << endl;

			if (checking_winner(matrix) == true) {
				point4++;
				round++;
				if (point3 + point4 + c == 5) {
					if (point3 > point4) {
						cout << "(" << str3 << ") IS THE WINNER.\n";
						round = 0; //<<--------------------------------------txt for single mode.
						stop();
						break;
					}

					if (point3 < point4) {
						cout << "(AI) IS THE WINNER.\n";
						round = 0;
						stop();
						break;
					}
					if (point3 == point4 && c < 5) {
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
				c += draw_count;
				if (c == 5) { //if it has bean a draw 5 times in a row and the player has started the game.
					draw_count = 0;
					c = 0;
					cout << "(" << str3 << ") IS THE WINNER.\n";
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
		else { //player 1 (X).
			temp = 1; //copying the random starting player results.
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
				if (point3 + point4 + c == 5) {
					if (point3 > point4) {
						cout << "(" << str3 << ") IS THE WINNER.\n";
						round = 0; //<<--------------------------------------txt for single mode.
						stop();
						break;
					}

					if (point3 < point4) {
						cout << "(AI) IS THE WINNER.\n";
						round = 0;
						stop();
						break;
					}
					if (point3 == point4 && c < 5) {
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
				c += draw_count;
				if (c == 5) { //if it has bean a draw 5 times in a row and the AI has started the game.
					draw_count = 0;
					c = 0;
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
			player++;
		}
	} while (0 <= round && round <= 5);

	for (int j = 0; j < 9; j++) {
		matrix[j] = tempp[j];
	}
	clear_Board();
	if (round != 0) { //reseting to defaults after last round.
		single_mode();
		round = 1;
		point3 = 0;
		point4 = 0;
		draw_count = 0;
	}
}

void dual_mode() { //two player mode.
	int player = random(), choice, round = 1, draw_count = 0;
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
				cin.ignore();
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
			draw_count++;
			if (draw_count == 5) { //if it's a tie 5 times in a row.
				if (player == 2) {
					board2();
					cout << "(" << str2 << ") IS THE WINNER.\n";
					draw_count = 0;
					stop();
				}
				if (player == 3) {
					board2();
					cout << "(" << str << ") IS THE WINNER.\n";
					draw_count = 0;
					stop();
				}
			}
		}

		if (round == 5) { //the winner after 5 rounds.
			if (point > point2) {
				board2();
				cout << "(" << str << ") IS THE WINNER.\n";
				duzFile.open("duz.txt");
				if (duzFile.is_open())
				{
					duzFile << str << point << endl;
					duzFile.close();
				}
				else {
					cout << "Unable to open file.";
				}
				stop();
			}
			if (point < point2) {
				board2();
				cout << "(" << str2 << ") IS THE WINNER.\n";
				duzFile.open("duz.txt");
				if (duzFile.is_open())
				{
					duzFile << str2 << point2 << endl;
					duzFile.close();
				}
				else {
					cout << "Unable to open file.";
				}
				stop();
			}
			if (point == point2 && draw_count < 5) {
				board2();
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
	draw_count = 0;
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
	ifstream duzFile; //the object to read text in txt fie.
	string name;
	int n;
	system("cls");
	cout << "\n1. winner list for single player mode.\n\n2. winner list for two player mode.\n\n3. return to home page.\n\nplease insert the number then press enter: ";

	do { //checking if the entry is between 1 and 3.
		cin >> n;
	} while (check(n) == false);

	if (n == 1) { //list of winners for single player mode.
				  /*if (duzFile.is_open()) {
				  while (duzFile >> name >> point) {
				  cout << "{ [" << name << "]___(" << point << ") }" << endl;
				  }
				  }
				  else {
				  cout << "\nthere are no winners yet.\n";
				  }
				  stop();*/
	}
	if (n == 2) { //list of winners for dual player mode.
				  /*if (duzFile.is_open()) {
				  while (duzFile >> name >> point) {
				  cout << "{ [" << name << "]___(" << point << ") }" << endl;
				  }
				  }
				  else {
				  cout << "\nthere are no winners yet.\n";
				  }
				  stop();*/
	}
}

void home() {
	int n;
	cout << "\t*********************************\n\t welcome to the tic tac toe game \n\t*********************************\n";
	stop();
	while (1) {
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
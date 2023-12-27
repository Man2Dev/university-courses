// my verjen

#include <iostream>
#include <fstream>
#include <string>
#include <time.h>
using namespace std;

int min(int board[9]);
int max(int board[9]);
int point3 = 0; //point of player in single player mode.
int point4 = 0; //points for the AI.
string str3; //name of player in single player mode.
string a[9] = { { "0" },{ "1" },{ "2" },{ "3" },{ "4" },{ "5" },{ "6" },{ "7" },{ "8" } }; //the board just for show.
string b[9] = { { "0" },{ "1" },{ "2" },{ "3" },{ "4" },{ "5" },{ "6" },{ "7" },{ "8" } }; //just a copy.
int c = 0;

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

int random() { //random player.
	srand(time(0));
	return 1 + rand() % 2;
}

void stop() { //just for making it look better.
	cout << endl;
	system("pause");
	cout << endl;
}

void board1() { //displays the board for single player mode.
	system("cls");
	cout << str3 << "(" << point3 << ")\tAI(" << point4 << ")\n._-_-_-_-_-_-_-_-_.\n|     |     |     |\n|  " << a[0] << "  |  " << a[1] << "  |  " << a[2] << "  |  \n|_____|_____|_____|\n|     |     |     |\n|  " << a[3] << "  |  " << a[4] << "  |  " << a[5] << "  |  \n|_____|_____|_____|\n|     |     |     |\n|  " << a[6] << "  |  " << a[7] << "  |  " << a[8] << "  |  \n|     |     |     |\n^-_-_-_-_-_-_-_-_-^\n\n";

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

void clear_Board() { //clears the board.

	for (int i = 0; i<9; i++) {
		a[i] = b[i];
	}
}

bool checking_winner(int board[9]) { //cheking for winner.
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

bool cheking_draw(int board[9]) { //checks if it's a draw.
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

void enter_name() {
	system("cls");
	cout << "enter your name: ";
	cin >> str3;
}

void single_mode() {
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

void active() { //activats single mode.
	enter_name();
	single_mode();
}

int main()
{
	active();
	return 0;
}

// old name verjen.
#include <iostream>
#include <fstream>
#include <string>
#include <time.h>
using namespace std;

int minEval(int board[9]);
int maxEval(int board[9]);
int point3 = 0; //point of player in single player mode.
int point4 = 0; //points for the AI.
string str3; //name of player in single player mode.
string a[9] = { { "0" },{ "1" },{ "2" },{ "3" },{ "4" },{ "5" },{ "6" },{ "7" },{ "8" } }; //the board just for show.
string b[9] = { { "0" },{ "1" },{ "2" },{ "3" },{ "4" },{ "5" },{ "6" },{ "7" },{ "8" } }; //just a copy.
int c = 0;

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

int random() { //random player.
	srand(time(0));
	return 1 + rand() % 2;
}

void stop() { //just for making it look better.
	cout << endl;
	system("pause");
	cout << endl;
}

void shape_Board() { //displays the board.
	system("cls");
	cout << str3 << "(" << point3 << ")\tAI(" << point4 << ")\n._-_-_-_-_-_-_-_-_.\n|     |     |     |\n|  " << a[0] << "  |  " << a[1] << "  |  " << a[2] << "  |  \n|_____|_____|_____|\n|     |     |     |\n|  " << a[3] << "  |  " << a[4] << "  |  " << a[5] << "  |  \n|_____|_____|_____|\n|     |     |     |\n|  " << a[6] << "  |  " << a[7] << "  |  " << a[8] << "  |  \n|     |     |     |\n^-_-_-_-_-_-_-_-_-^\n\n";

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

void clear_Board() { //clears the board.

	for (int i = 0; i<9; i++) {
		a[i] = b[i];
	}
}

bool checkWin(int board[9]) { //checks if some one won.
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

bool checkDraw(int board[9]) { //checks if it's a draw.
	int count = 0;
	for (int i = 0; i<9; i++) {
		if (board[i] != 0) { //all the blocks are oginaly filled with 0. 
			count++;
		}
	}
	if (count == 9) {
		return true;
	}
	else {
		return false;
	}
}

int maxEval(int board[9]) {
	if (checkDraw(board)) {
		return 0;
	}
	else if (checkWin(board)) {
		return -1000;
	}
	int finalScore = -1000;
	for (int i = 0; i < 9; i++) {
		if (board[i] == 0) {
			board[i] = 1;
			int score = minEval(board);
			if (score > finalScore) {
				finalScore = score;
			}
			board[i] = 0;
		}
	}
	return finalScore;
}

int minEval(int board[9]) {
	if (checkDraw(board)) {
		return 0;
	}
	else if (checkWin(board)) {
		return 1000;
	}
	int finalScore = 1000;
	for (int i = 0; i < 9; i++) {
		if (board[i] == 0) {
			board[i] = -1;
			int score = maxEval(board);
			if (score < finalScore) {
				finalScore = score;
			}
			board[i] = 0;
		}
	}
	return finalScore;
}

void playMove(int board[9], int player) {
	int finalScore = player * -1000;
	int position;
	for (int i = 0; i < 9; i++) {
		if (board[i] == 0) {
			board[i] = player;
			int score;
			if (player == 1) {
				score = minEval(board);
			}
			else {
				score = maxEval(board);
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

void enter_name() {
	system("cls");
	cout << "enter your name: ";
	cin >> str3;
}

void single_mode() {
	int player = random(), temp;
	int matrix[9] = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	int tempp[9] = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	int n, round = 1, draw_count = 0;

	do {
		if (player % 2 == 0 && player < 9) { //calling the AI to play (O).
			player = -1;
			temp = 2;

			playMove(matrix, player);
			input_board(matrix);
			shape_Board();
			cout << endl;

			if (checkWin(matrix) == true) {
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

			else if (checkDraw(matrix) == true) {
				round++;
				draw_count++;
				c += draw_count;
				if (c == 5) { //if it has bean a draw 5 times in a row and the player has started the game.
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

			input_board(matrix);
			shape_Board();
			cout << endl;
		}
		else { //player 1 (X).
			temp = 1; //copying the random starting player results.
			input_board(matrix);
			shape_Board();
			cout << endl;

			cout << str3 << " enter a number:  ";
			do {
				cin >> n;
			} while (check2(n) == false || check3(n, matrix) == false); //checking if entery is coerct if not trying another entery.
			matrix[n] = 1;

			input_board(matrix);
			shape_Board();
			cout << endl;

			if (checkWin(matrix) == true) {
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

			else if (checkDraw(matrix) == true) {
				round++;
				draw_count++;
				c += draw_count;
				if (c == 5) { //if it has bean a draw 5 times in a row and the AI has started the game.
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

void active() { //activats single mode.
	enter_name();
	single_mode();
}

int main()
{
	active();
	return 0;
}
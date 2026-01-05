#include <iostream>
using namespace std;

void Printn(int n) {
    int count = 1;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            cout << count++ << " ";
            if (count == 10) {
                count = 1;
            }
        }
        cout << endl;
    }
}

int main() {
    int n;
    cin >> n;
    Printn(n);
    return 0;
}
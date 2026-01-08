#include <iostream>

using namespace std;

int gcd (int a, int b) {
    if (b == 0) {
        return a;
    }
    else {
        return gcd(b, a % b);
    }
}

int main() {
    int n,m;
    cin>>n>>m;
    const int ans = gcd(n, m);
    cout<<ans<<endl;
    return 0;
}
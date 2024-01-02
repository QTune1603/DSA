#include <iostream>
#include <string>
#include <cmath>
#include<vector>
#include <bits/stdc++.h>
#define ll long long

using namespace std;

//c4 : convert to c++
// sumOdd

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(0); cout.tie(0);

    int m,n; cin >> m >> n;
    for(int i = 1 ; i <= m ; i++){
        for(int j = 1 ; j <= n ; j++){
            if(i == 1 || i == m || j == 1 || j == n){
                cout << "*";
            }
            else {
                cout << " ";
            }
        }
        cout << endl;
    }
}


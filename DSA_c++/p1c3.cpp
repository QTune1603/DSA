#include <iostream>
#include <string>
#include <cmath>
#include<vector>
#include <bits/stdc++.h>
#define ll long long

using namespace std;

//c3 : convert to c++
// check even and odd number

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(0); cout.tie(0);

    int number; cin >> number;
    if(number % 2 == 0){
        cout << "Even";
    }
    else cout << "Odd";

    //test : 11,15,26,13
    // output : odd,odd,even,odd

    return 0;
}


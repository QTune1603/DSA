#include <iostream>
#include <string>
#include <cmath>
#include<vector>
#include <bits/stdc++.h>
#define ll long long

using namespace std;

//c1 : binary string to char string

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(0); cout.tie(0);

    string s;
    getline(cin,s);
    stringstream ss(s);
    string tmp ="";
    while(ss >> tmp){
        int res = 0, cnt = 0;
        int num = stoi(tmp);
        while(num > 0){
            res += num%10 * pow(2,cnt);
            cnt++;
            num /= 10;
        }
        cout << (char)res << "";
    }

    // => B is the correct answer : algorithm


    return 0;
}

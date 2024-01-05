#include <iostream>
#include <string>
#include <cmath>
#include<vector>
#include <bits/stdc++.h>
#define ll long long

using namespace std;

//c2 check prime

bool check(int n){
    if(n < 2){
        return false;
    }
    if(n == 2) {
        return true;
    }
    if(n % 2 == 0){
        return false;
    }
    int limit = sqrt(n);
    for(int i = 3 ; i <= limit ; i++){
        if(n % i == 0) return false;
    }
    return true;
}


int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(0); cout.tie(0);

    int number; cin >> number;
    if(number % 2 == 0){
        cout << "Even";
    }
    else cout << "Odd";

    //test : 11,15,26,13
    // output :

    return 0;
}


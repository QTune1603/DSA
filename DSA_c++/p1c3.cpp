#include <iostream>
#include <string>
#include <cmath>
#include<vector>
#include <bits/stdc++.h>
#define ll long long

using namespace std;

//c3 : convert to c++
// check sum of odd number

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(0); cout.tie(0);

    int n = 100;
    int sum = 0;
    for(int i = 1 ; i <= n ; i++){
        if(i % 2 != 0){
            sum += i;
        }
    }
    cout << sum;
}


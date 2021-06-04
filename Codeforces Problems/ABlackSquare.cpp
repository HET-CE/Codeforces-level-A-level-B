#include<bits/stdc++.h>
using namespace std;

int a,b,c,d;

int solve(char n){
    if(n == '1')
        return a;
    if(n == '2')
        return b;
    if(n == '3')
        return c;
    if(n == '4')
        return d;
}

int main(int argc, char const *argv[])
{
    string s;
    scanf("%d%d%d%d",&a,&b,&c,&d);
    cin>>s;

    int sum = 0;
    for(int i = 0 ; i < s.size() ; i++){
        sum += solve(s[i]);
    }
    cout<<sum;
    return 0;
}

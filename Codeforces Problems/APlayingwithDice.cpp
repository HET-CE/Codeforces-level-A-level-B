#include<bits/stdc++.h>
using namespace std;

int main(){
    int a,b;
    cin>>a>>b;
    int x=0,y=0,z=0;
    for(int i = 1 ; i <=6 ; i++){
        if(abs(a-i) < abs(b-i))
            x++;
        else if(abs(a-i) == abs(b-i))
            y++;
        else if(abs(a-i) > abs(b-i))
            z++;
    }
    cout<<x<<" "<<y<<" "<<z;
}
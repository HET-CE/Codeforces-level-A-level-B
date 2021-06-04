#include<bits/stdc++.h>
#include <iostream>

using namespace std;

int main()
{
    int n,m;
    cin>>n;
    cin>>m;
    vector<int> v;
    int temp2;
    for(int i = 0 ; i < n ; i++){
        cin>>temp2;
        v.push_back(temp2);
    }
    set<int> s;

    int temp;
    for(int i = 0 ; i < m ; i++){
        cin>>temp;
        s.clear();
        for(int i = temp-1 ; i < n ; i++){
            s.insert(v[i]);
        }
        cout<<s.size()<<endl;
    }
}

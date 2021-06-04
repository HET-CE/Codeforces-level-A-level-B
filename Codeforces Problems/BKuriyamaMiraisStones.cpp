#include<bits/stdc++.h>
using namespace std;

int main(int argc, char const *argv[])
{
        int n;
        cin>>n;

        long long arr1[n];
        long long arr2[n];

        multiset<long long> pq;

        for(int i = 0 ; i < n ; i++){
            cin>>arr1[i];
            pq.insert(arr1[i]);
        }

        int y = 0;
        for(auto x : pq){
            arr2[y] = x;
            y++;
        }

        long m;
        cin>> m;
        long sum = 0;
        int l ,r,type;
        for(int i = 0 ; i < m ; i++){
            cin>>type;
            cin>>l;
            cin>>r;
            sum = 0;
            if(type == 1){
                for(int j = l-1 ; j < r ; j++){
                    sum += arr1[j];
                }
                cout<<sum<<endl;
            }
            if(type == 2){
                for(int j = l-1 ; j < r ; j++){
                    sum += arr2[j];
                }
                cout<<sum<<endl;
            }
        }
    return 0;
}


// // Iterator to the beginning of set
// auto iter = setOfStr.begin();
// // It will move forward the passed iterator by passed value
// std::advance(iter, 3);
// std::cout<<"3rd Element in set = "<<*iter<<std::endl;

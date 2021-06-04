#include<bits/stdc++.h>
using namespace std;

int main(int argc, char const *argv[])
{
    int n;
    cin>>n;
    int arr[100000];
    int track=0, ans=0;
    for(int i = 0 ; i < n ; i++){
        cin>>arr[i];
    }

    bool flag = false;
    for(int i = 0 ; i < n ; i++){
        if(arr[i] < 0 && flag == false){
            ans++;
        }
        if(arr[i] > 0){
            flag = true;
        }
        if(flag) {
            track += arr[i];
            if(track < 0 && arr[i] < 0)
                ans++;
        }
    }
    cout<<ans;
    return 0;
}

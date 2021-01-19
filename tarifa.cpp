#include <iostream>
using namespace std;

int main() { 
  int x;
  cin>>x;
  if(1<=x && x<=100){
    int n;
    cin>>n;
    if(1<=n && n<=100){
      bool ch=true;
      int p,sum=x;
      for(int i=0;i<n;i++){
        cin>>p;
        if(0<=p && p<=10000)
          sum+=x-p;
        else{
          ch=false;
          break;
        }
      }
      if(ch) cout<<sum;
    }
  }
  
}


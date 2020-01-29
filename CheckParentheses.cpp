#include <bits/stdc++.h>
using namespace std;


int main()
{
    stack <char> s;
    string st = "{{()}}";
    for(int i=0; i<st.length();i++){
        if(st[i] == '{' || st[i] == '('){
            s.push(st[i]);
        }
        else if(st[i] == '}' && s.top() == '{'){
            s.pop();
        }
        else if(st[i] == ')' && s.top() == '('){
            s.pop();
        }
    }
    if(s.size() == 0){
        cout<<"T";
    }
    else 
        cout<<"F";
    return 0;
}

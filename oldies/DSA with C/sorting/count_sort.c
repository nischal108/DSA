#include<stdio.h>
#define MAX 10
#define MAXVALUE 21
//max value nikalna tah nikalna milthyo tara  c le dynamic array size allocation nei didaina
//malloc haru use garda tah hunxa tara easy nei gareko 

int getHighestNumber(int arr[], int n){
    int maxArrayElement = arr[0];
    int i;
    for(i=1;i<n;i++)
        if(arr[i]>maxArrayElement)
        maxArrayElement = arr[i];
    return maxArrayElement;
}

void countsort(int arr[], int size){
    int count[MAXVALUE] ={0};
    int i;
    int temp[MAXVALUE];
    int k = getHighestNumber(arr,size);
    //performing frequency calculation
    for(i=0;i<size;i++){
        count[arr[i]]++;
    }
    //calculating the cummulative frequency 
    for(i=1;i<=k;i++)
    count[i]+=count[i-1];
    //sort the array and put it into thr temp array 
    for(i=size-1;i>=0;i--){
        temp[--count[arr[i]]] = arr[i];
    }
    //copying temp to the main array
    for(i=0;i<size;i++){
        arr[i] =temp[i];
    }
}

int main(){
    int i;
    int arr[MAX] = {2,5,6,7,4,3,8,1,3,6};
    int n = sizeof(arr) /sizeof(int);
    printf("%d",n);
    printf("\n Before sorting............ : \n");
    for ( i = 0; i < n; i++)
    {
        printf("%d \t ",arr[i]);
    }
    countsort(arr,n);
    printf(" \n After sorting.......... \n");
    for ( i = 0; i < n; i++)
    {
        printf("%d \t ",arr[i]);
    }
    return 0;
}
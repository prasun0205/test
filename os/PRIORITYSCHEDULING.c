#include <stdio.h>

int main() {
    int bt[20], p[20], wt[20], tat[20], pr[20], i, j, n, total = 0, pos, temp, avg_wt, avg_tat;
    printf("Enter Total Number of Process:");
    scanf("%d", &n);
    printf("\nEnter Burst Time and Priority\n");
    for (i = 0; i < n; i++) {
        printf("\nP[%d]\n", i + 1);
        printf("Burst Time:");
        scanf("%d", &bt[i]);
        printf("Priority:");
        scanf("%d", &pr[i]);
        p[i] = i + 1;
    }
    for (i = 0; i < n - 1; i++) {
        pos = i;
        for (j = i + 1; j < n; j++) {
            if (pr[j] < pr[pos])
                pos = j;
        }
        temp = pr[i];
        pr[i] = pr[pos];
        pr[pos] = temp;
        temp = bt[i];
        bt[i] = bt[pos];
        bt[pos] = temp;
        temp = p[i];
        p[i] = p[pos];
        p[pos] = temp;
    }
    wt[0] = 0;
    for (i = 1; i < n; i++) {
        wt[i] = 0;
        for (j = 0; j < i; j++)
            wt[i] += bt[j];
        total += wt[i];
    }
    avg_wt = total / n;
    total = 0;
    printf("\nProcess\t    Burst Time    \tWaiting Time\tTurnaround Time");
    for (i = 0; i < n; i++) {
        tat[i] = bt[i] + wt[i];
        total += tat[i];
        printf("\nP[%d]\t\t  %d\t\t    %d\t\t\t%d", p[i], bt[i], wt[i], tat[i]);
    }
    avg_tat = total / n;
    printf("\n\nAverage Waiting Time=%d", avg_wt);
    printf("\nAverage Turnaround Time=%d\n", avg_tat);
    return 0;
}















//OUTPUT:




Enter Total Number of Process:5

Enter Burst Time and Priority

P[1]
Burst Time:4
Priority:3

P[2]
Burst Time:5
Priority:2

P[3]
Burst Time:8
Priority:2

P[4]
Burst Time:7
Priority:1

P[5]
Burst Time:3
Priority:3

Process     Burst Time          Waiting Time    Turnaround Time
P[4]              7                 0                   7
P[2]              5                 7                   12
P[3]              8                 12                  20
P[1]              4                 20                  24
P[5]              3                 24                  27

Average Waiting Time=12
Average Turnaround Time=18

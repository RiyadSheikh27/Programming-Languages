#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>

int main() {
    int num1, num2;
    pid_t pid;

    printf("Enter two numbers: ");
    scanf("%d %d", &num1, &num2);

    pid = fork();

    if (pid < 0) {
        fprintf(stderr, "Fork failed\n");
        return 1;
    }

    if (pid == 0) {
        printf("Child process: PID = %d\n", getpid());
        printf("Sum of %d and %d is: %d\n", num1, num2, num1 + num2);
        printf("Difference of %d and %d is: %d\n", num1, num2, num1 - num2);
        exit(0); 
    } else {
        printf("Parent process: PID = %d\n", getpid());
        printf("Waiting for child process to complete...\n");
        wait(NULL);
        printf("Child process completed, parent process terminating.\n");
    }

    return 0;
}

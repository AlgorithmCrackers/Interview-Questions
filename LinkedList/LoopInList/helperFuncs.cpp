
struct node* BuildOneToSixWithLoop() {
    struct node* head = NULL;
    head = malloc(sizeof(struct node));
    head->data = 2;
    struct node* current = head;
    struct node* loopEntry = NULL;
    // loop is from 6->3
    for(int d=2; d<=6; d++) {
        current->next = malloc(sizeof(struct node));
        current->next->data = d;
        current = current->next;
        if (d == 3) loopEntry = current;
    }
    current->next = loopEntry; // current now points to {6}
    return head;
}

void printLinkedList(struct node* head) {
    // add a set to check the loop and then stop printing || NULL !
    struct node* current = head;
    printf("\n");
    while (current != NULL) {
        printf( "(%d) -> ", current->data );
        current = current->next;
    }
    printf("NULL\n");
}

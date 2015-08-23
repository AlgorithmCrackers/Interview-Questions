struct node {
    int data;
    struct node *next;
}

bool hasLoop(struct node *head)
{
    struct node *pslow = head;
    struct node *pfast = head;
    while(pfast != NULL && pfast->next != NULL)
    {
        pslow = pslow->next;
        pfast = pfast->next->next;
        if(pslow == pfast)
            return true;
    }
    return false;
}

int main() {

}


public class RotateList {
	ListNode head;
	class ListNode {
	     int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	void insert(int data) {
		if(head==null) {
			head=new ListNode(data);
			return;
		}
		ListNode temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=new ListNode(data);
	}
	public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0) return head;
        int count=1;
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
            count++;
        }
        if(k%count==0) return head;
        temp.next=head;
        int rotation=count-(k%count);
        ListNode p=head;
        for(int i=1;i<rotation;i++){
            p=p.next;
        }
        head=p.next;
        p.next=null;
        return head;
    }
	public static void main(String[] args) {
		RotateList rl=new RotateList();
		rl.insert(10);
		rl.insert(20);
		rl.insert(30);
		rl.insert(40);
		rl.insert(50);
		rl.insert(60);
		rl.insert(70);
		rl.insert(80);
		ListNode head=rl.rotateRight(rl.head, 14);
		ListNode temp=head;
		while(temp!=null) {
			System.out.println(temp.val);
			temp=temp.next;
		}
	}

}

import java.io.Serializable;

public class DataBase<T> implements Serializable{
	class Node{
		T obj;
		Node left;
		Node right;
		double id;
		
		Node(){}
		Node(T o,double d){
			obj=o;
			id=d;
			left=null;
			right=null;
		}
	}
	
	private Node root;
	
	public Node getRoot(){
		return this.root;
	}
	
	DataBase(long MAX){
		root=new Node(null,MAX/2+0.5);
	}
	
	private Node clone(Node n){
		return new Node(n.obj,n.id);
	}
	
	public boolean insert(T t,String num){
		Double id=Double.parseDouble(num);
		Node node=new Node(t,id);
		Node temp=root;
		
		while(true){
			if(id<temp.id){
				if(temp.left!=null)
					temp=temp.left;
				else{
					temp.left=node;
					break;
				}
			}
			else{
				if(temp.right!=null)
					temp=temp.right;
				else{
					temp.right=node;
					break;
				}	
			}
		}
		
		return true;
	}
	
	public Node search(double id){
		Node temp=root;
		while(temp!=null){
			if(id==temp.id){
				return temp;
			}
			else if(id<temp.id){
				temp=temp.left;
			}
			else if(id>temp.id){
				temp=temp.right;
			}
		}
		return null;
		
	}
	
	public boolean delete(double id){
		Node temp=search(id);
		if(temp!=null){
			if(temp.left==null&&temp.right==null){
				temp=null;
			}
			else if(temp.left==null){
				temp.id=temp.right.id;
				temp.obj=temp.right.obj;
				temp.left=temp.right.left;
				temp.right=temp.right.right;
			}
			else if(temp.right==null){
				temp.id=temp.left.id;
				temp.obj=temp.left.obj;
				temp.right=temp.left.right;
				temp.left=temp.left.left;
			}
			else{
				Node orign=search(id);
				while(temp.left!=null){
					temp=temp.left;
				}
				orign.id=temp.id;
				orign.obj=temp.obj;
				if(temp.right==null)
					temp=null;
				else{
					temp.id=temp.right.id;
					temp.obj=temp.right.obj;
					temp.left=temp.right.left;
					temp.right=temp.right.right;
				}
			}
			return true;
		}
		else
			return false;
	}
	
}

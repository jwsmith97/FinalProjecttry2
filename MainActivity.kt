package c.example.finalproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

private ArrayList<toDoItem> todoItems;
private ArrayAdapter<ToDoItem> aa;

public void onCreate (Bundle savedInstanceState) (
super.onCreate (savedInstanceState)
setContentView(R.layout.main)
FragmentManger fm = getFragmentManger();
ToDoListFragment todoListFragment=
(ToDoListFragment) fm.findFragmentById(R.id.TodoListFragment);
todoItems = new ArrayList <ToDoItem> ()
aa=new ArrayAdapter<ToDoItem>(this, resID, todoItems)
    todoListFragment.setListAdapter(aa);

    public void onNewItemAdded (String newItem)
    ToDoItem newTodoItem = newToDoItem (newItem);
    todoItems.add (0, newTodoItem)
    aa.notifyDataSetChanged ();

    aa= new ToDoItemAdapter (this, resID, todoItems);
}
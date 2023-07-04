public class Todo extends Task {
  protected boolean isDone;

  public Todo(String description){
    super(description);
    this.isDone = false;
  }

  public boolean isDone(){
    return this.isDone;
  }

  public void setDone(boolean bool){
    this.isDone = bool;
  }

  @Override
  public String toString(){
    String status;
    if (this.isDone){
      status = "Yes";
    }
    else{
      status = "No";
    }
    return super.toString() + System.lineSeparator() + "is done? " + status;
  }
}

package Book.Implements;



public class ErrorMsg {
    final int OUTER = 0;
    final int INERR = 1;
    final int DISKER = 2;
    final int INDEXERR = 3;

    String[] msgs = {"Error output", " Error input", "Отсутствует место на диске", "Выход индекса за границы диапазона"};

    String getErrorMsg(int i){
        if(i >= 0 & i < msgs.length)
            return msgs[i];
        else
            return "Несуществующий код ошибки";
    }
}

package Book.Implements;

public class Error {
    String msg;
    int severity;

    Error(String m, int s) {
        msg = m;
        severity = s;
    }

    static class ErrInfo {
        String msgs[] = {"Ошибка вывода", "Ошибка ввода", "Отсутствует место на диске", "Вызод индекса за границы диапазона"};
        int howbad[] = {3, 3, 2, 4};

        Error getErrorInfo(int i) {
            if (i >= 0 & i < msgs.length)
                return new Error(msgs[i], howbad[i]);
            else
                return new Error("Несуществующий код ошибки", 0);

        }

    }


}

import java.util.List;

class Problem9 {

    /**
     * Changes a list of type elements into comma-separated string. They are converted by using the .toString() method
     *
     * @param list given list of element types to be converted
     * @return String of list elements, separated by commas.
     */
    static <T> String stringifyList(List<T> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            s.append(list.get(i).toString());
            if (i < list.size() - 1) {
                s.append(", ");
            }
        }
        return s.toString();
    }
}

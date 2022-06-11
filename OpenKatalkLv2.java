package com.sj.study.random;

import java.util.*;

public class OpenKatalkLv2 {

    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi",
                            "Enter uid4567 Prodo",
                            "Leave uid1234",
                            "Enter uid1234 Prodo",
                            "Change uid4567 Ryan"};

        System.out.println(solution(record));
    }

    /*record	                    result
["Enter uid1234 Muzi",          ["Prodo님이 들어왔습니다.",
"Enter uid4567 Prodo",            "Ryan님이 들어왔습니다.",
"Leave uid1234",                  "Prodo님이 나갔습니다.",
"Enter uid1234 Prodo",             "Prodo님이 들어왔습니다."]
"Change uid4567 Ryan"]
*/
    public static Object solution(String[] record){
        String[] answer = {};

        List<String> command = new LinkedList<>();
        Map<String, String> nickName = new HashMap<>();

        Map<String, String> nick2 = new HashMap<>();
        String ch = null;
        String ch2 = null;
        for (String s:record) {
            //nickName.put(s.split(" ")[1], s.split(" ")[2]);
            //System.out.println(nickName);

            String com1 = s.split(" ")[0].toUpperCase();
            String nick = null;
            if (s.split(" ")[0].equals("Enter")){
                nick = s.split(" ")[2];
                nick2.put(s.split(" ")[1], nick);
            } else if (s.split(" ")[0].equals("Change")) {
                 ch = nick2.get(s.split(" ")[1]);
                 ch2 = s.split(" ")[2];
                nick2.put(s.split(" ")[1], s.split(" ")[2]);
            } else{
                nick = nick2.get(s.split(" ")[1]);
            }

            if (com1.equals("ENTER")) {
                command.add(nick + "님이 들어오셨습니다.");
            } else if (com1.equals("LEAVE")) {
                command.add(nick + "님이 나가셨습니다.");
            } else {
                for (int i = 0; i < command.size(); i++) {
                    command.get(i).replace(Objects.requireNonNull(ch), Objects.requireNonNull(ch2));
                }
            }

        }

        return command;
    }

}

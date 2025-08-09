package com.enset.controller;

import com.enset.domain.TalkAtive;
import com.enset.service.TalkaTiveImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        TalkAtive talkAtive1=new TalkAtive(20);
        TalkAtive talkAtive2=new TalkAtive(30);
        TalkAtive talkAtive3=new TalkAtive(40);
        TalkAtive talkAtive4=new TalkAtive(50);
        TalkAtive talkAtive5=new TalkAtive(60);
//        List<TalkAtive> talkAtives=new ArrayList<>();
//        talkAtives.add(talkAtive1);
//        talkAtives.add(talkAtive2);
//        talkAtives.add(talkAtive3);
//        talkAtives.add(talkAtive4);
//        talkAtives.add(talkAtive5);
        TalkaTiveImpl talkImp1=new TalkaTiveImpl(talkAtive1);
        TalkaTiveImpl talkImp2=new TalkaTiveImpl(talkAtive2);
        TalkaTiveImpl talkImp3=new TalkaTiveImpl(talkAtive3);
        TalkaTiveImpl talkImp4=new TalkaTiveImpl(talkAtive4);
        TalkaTiveImpl talkImp5=new TalkaTiveImpl(talkAtive5);

// This is my version works just fine but messy
//        Thread t1=new Thread(talkImp1);
//        Thread t2=new Thread(talkImp2);
//        Thread t3=new Thread(talkImp3);
//        Thread t4=new Thread(talkImp4);
//        Thread t5=new Thread(talkImp5);

        //Chatgpt version
        Thread t1 = new Thread(talkImp1, "Talkative-1");
        Thread t2 = new Thread(talkImp2, "Talkative-2");
        Thread t3 = new Thread(talkImp3, "Talkative-3");
        Thread t4 = new Thread(talkImp4, "Talkative-4");
        Thread t5 = new Thread(talkImp5, "Talkative-5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
package com.enset.service;

import com.enset.domain.TalkAtive;

public class TalkaTiveImpl implements Runnable {
final private TalkAtive talka;
    @Override
    public void run() {
for (int i = 0; i < 100; i++) {
    //this is mine but chatgpt suggested the below
//    System.out.println("Number: " + i);
//    System.out.println("This is a test of talka" + talka.getNumber());
    //chatgpted improvment
    System.out.println(Thread.currentThread().getName() + " - iteration " + i + " - Number: " + talka.getNumber());

}
    }

    public TalkaTiveImpl(TalkAtive talka) {
        this.talka = talka;
    }

    public TalkAtive getTalka() {
        return talka;
    }
}

package com.enset.service;

import com.enset.domain.TalkAtive;

public class TalkaTiveImpl implements Runnable {
final private TalkAtive talka;
    @Override
    public void run() {
for (int i = 0; i < 100; i++) {
    System.out.println("This is a test of talka" + talka);
}
    }

    public TalkaTiveImpl(TalkAtive talka) {
        this.talka = talka;
    }

    public TalkAtive getTalka() {
        return talka;
    }
}

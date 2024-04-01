package X;

import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import java.io.File;

/* renamed from: X.1w2  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C42611w2 {
    public int A00;
    public int A01;
    public Point A02;
    public Rect A03;
    public C72653aN A04;
    public File A05;
    public File A06;
    public Byte A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final Uri A0F;

    public C42611w2(Uri uri) {
        this.A00 = 0;
        this.A0F = uri;
    }

    public C42611w2(Uri uri, C42611w2 c42611w2) {
        String str;
        Rect rect;
        C72653aN c72653aN;
        boolean z;
        boolean z2;
        this.A00 = 0;
        this.A0F = uri;
        this.A07 = c42611w2.A06();
        this.A06 = c42611w2.A05();
        this.A08 = c42611w2.A07();
        this.A0B = c42611w2.A09();
        this.A09 = c42611w2.A08();
        synchronized (c42611w2) {
            str = c42611w2.A0A;
        }
        this.A0A = str;
        this.A05 = c42611w2.A03();
        synchronized (c42611w2) {
            rect = c42611w2.A03;
        }
        this.A03 = rect;
        this.A02 = c42611w2.A02();
        synchronized (c42611w2) {
            c72653aN = c42611w2.A04;
        }
        this.A04 = c72653aN;
        this.A01 = c42611w2.A01();
        this.A0E = c42611w2.A0D();
        synchronized (c42611w2) {
            z = c42611w2.A0D;
        }
        this.A0D = z;
        this.A00 = c42611w2.A00();
        synchronized (c42611w2) {
            z2 = c42611w2.A0C;
        }
        this.A0C = z2;
    }

    public synchronized int A00() {
        return this.A00;
    }

    public synchronized int A01() {
        return this.A01;
    }

    public synchronized Point A02() {
        return this.A02;
    }

    public synchronized File A03() {
        return this.A05;
    }

    public synchronized File A04() {
        File file;
        file = this.A05;
        if (file == null) {
            file = this.A06;
        }
        return file;
    }

    public synchronized File A05() {
        return this.A06;
    }

    public synchronized Byte A06() {
        return this.A07;
    }

    public synchronized String A07() {
        return this.A08;
    }

    public synchronized String A08() {
        return this.A09;
    }

    public synchronized String A09() {
        return this.A0B;
    }

    public synchronized void A0A(Byte b) {
        this.A07 = b;
    }

    public synchronized void A0B(String str) {
        this.A08 = str;
    }

    public synchronized void A0C(String str) {
        this.A0B = str;
    }

    public synchronized boolean A0D() {
        return this.A0E;
    }
}

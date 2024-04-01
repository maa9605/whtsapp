package X;

import android.content.Context;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: X.0m5 */
/* loaded from: classes.dex */
public class C13930m5 {
    public int A00;
    public C0m4 A01;
    public boolean A06 = false;
    public boolean A02 = false;
    public boolean A05 = true;
    public boolean A03 = false;
    public boolean A04 = false;

    public void A00() {
        throw null;
    }

    public void A01() {
    }

    public void A02() {
        throw null;
    }

    public void A03() {
    }

    public boolean A06() {
        throw null;
    }

    public C13930m5(Context context) {
        context.getApplicationContext();
    }

    public void A04(Object obj) {
        C0m4 c0m4 = this.A01;
        if (c0m4 != null) {
            C0HL c0hl = (C0HL) c0m4;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                c0hl.A0B(obj);
            } else {
                c0hl.A0A(obj);
            }
        }
    }

    public void A05(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.A00);
        printWriter.print(" mListener=");
        printWriter.println(this.A01);
        if (this.A06 || this.A03 || this.A04) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.A06);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.A03);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.A04);
        }
        if (this.A02 || this.A05) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.A02);
            printWriter.print(" mReset=");
            printWriter.println(this.A05);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        C07O.A0v(this, sb);
        sb.append(" id=");
        return C000200d.A0K(sb, this.A00, "}");
    }
}

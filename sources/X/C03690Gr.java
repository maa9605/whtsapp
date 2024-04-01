package X;

import android.database.Cursor;
import android.database.CursorWrapper;

/* renamed from: X.0Gr */
/* loaded from: classes.dex */
public class C03690Gr {
    public static volatile C03690Gr A07;
    public final C05Q A00;
    public final C05A A01;
    public final C0D5 A02;
    public final C05E A03;
    public final C05C A04;
    public final C05L A05;
    public final C03700Gs A06;

    public C03690Gr(C05A c05a, C0D5 c0d5, C03700Gs c03700Gs, C05C c05c, C05L c05l, C05Q c05q, C05E c05e) {
        this.A01 = c05a;
        this.A02 = c0d5;
        this.A06 = c03700Gs;
        this.A04 = c05c;
        this.A05 = c05l;
        this.A00 = c05q;
        this.A03 = c05e;
    }

    public static C03690Gr A00() {
        if (A07 == null) {
            synchronized (C03690Gr.class) {
                if (A07 == null) {
                    A07 = new C03690Gr(C05A.A00(), C0D5.A00(), new C03700Gs(), C05C.A00(), C05L.A00(), C05Q.A00(), C05E.A00());
                }
            }
        }
        return A07;
    }

    public int A01(AbstractC005302j abstractC005302j, C0HE c0he) {
        String l = Long.toString(this.A01.A05(abstractC005302j));
        C0CD A03 = this.A03.A03();
        try {
            Cursor A08 = A03.A02.A08("SELECT COUNT(*) as count FROM message_link WHERE chat_row_id = ?", new String[]{l}, c0he);
            if (!((CursorWrapper) A08).moveToFirst()) {
                ((CursorWrapper) A08).close();
                A03.close();
                return 0;
            }
            CursorWrapper cursorWrapper = (CursorWrapper) A08;
            int i = cursorWrapper.getInt(cursorWrapper.getColumnIndexOrThrow("count"));
            cursorWrapper.close();
            A03.close();
            return i;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A03.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public int A02(AbstractC005302j abstractC005302j, C0HE c0he) {
        if (A03()) {
            return A01(abstractC005302j, c0he);
        }
        String rawString = abstractC005302j.getRawString();
        C0CD A03 = this.A03.A03();
        try {
            Cursor A08 = A03.A02.A08("SELECT COUNT(*) as count FROM messages_links WHERE key_remote_jid = ?", new String[]{rawString}, c0he);
            if (!((CursorWrapper) A08).moveToFirst()) {
                ((CursorWrapper) A08).close();
                A03.close();
                return 0;
            }
            CursorWrapper cursorWrapper = (CursorWrapper) A08;
            int i = cursorWrapper.getInt(cursorWrapper.getColumnIndexOrThrow("count"));
            cursorWrapper.close();
            A03.close();
            return i;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A03.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public boolean A03() {
        String A02 = this.A04.A02("links_ready");
        return A02 != null && Long.parseLong(A02) == 2;
    }
}

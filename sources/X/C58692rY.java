package X;

import android.os.Process;
import android.text.SpannableStringBuilder;
import android.text.util.Linkify;
import android.widget.TextView;
import java.util.ArrayList;

/* renamed from: X.2rY  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C58692rY extends Thread {
    public final C58682rX A00;
    public final C0DW A01;
    public final C0DV A02;
    public final String A03;
    public volatile boolean A04;
    public final /* synthetic */ C58712ra A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58692rY(C58712ra c58712ra, C58682rX c58682rX, String str, C0DV c0dv, C0DW c0dw) {
        super("LinkifierThread");
        this.A05 = c58712ra;
        this.A00 = c58682rX;
        this.A03 = str;
        this.A02 = c0dv;
        this.A01 = c0dw;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (!this.A04) {
            try {
                C58702rZ c58702rZ = (C58702rZ) this.A00.A00.takeLast();
                if (c58702rZ != null) {
                    CharSequence charSequence = c58702rZ.A02;
                    TextView textView = c58702rZ.A00;
                    Object obj = c58702rZ.A03;
                    InterfaceC58672rW interfaceC58672rW = c58702rZ.A01;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                    if (obj.equals(textView.getTag())) {
                        String str = this.A03;
                        C0DV c0dv = this.A02;
                        C0DW c0dw = this.A01;
                        try {
                            Linkify.addLinks(spannableStringBuilder, 2);
                            C04310Jr.A06(spannableStringBuilder);
                            C02180Ae.A10(spannableStringBuilder, str);
                            C02180Ae.A0z(spannableStringBuilder, c0dv, c0dw);
                        } catch (Exception unused) {
                        }
                        ArrayList A0x = AnonymousClass029.A0x(spannableStringBuilder);
                        if (A0x != null && !A0x.isEmpty() && obj.equals(textView.getTag())) {
                            C58712ra c58712ra = this.A05;
                            c58712ra.A01.A08(charSequence.toString(), new SpannableStringBuilder(spannableStringBuilder));
                            C018508q c018508q = c58712ra.A02;
                            c018508q.A02.post(new RunnableEBaseShape1S0500000_I1(this, spannableStringBuilder, textView, obj, interfaceC58672rW));
                        }
                    }
                }
            } catch (InterruptedException unused2) {
                return;
            }
        }
    }
}

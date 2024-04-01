package X;

import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;

/* renamed from: X.45l  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C890445l implements TextWatcher {
    public Runnable A00;
    public final long A01;
    public final Handler A02 = new Handler(Looper.getMainLooper());
    public final AnonymousClass087 A03;
    public final C016807u A04;
    public final C892646i A05;

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C890445l(C016807u c016807u, AnonymousClass087 anonymousClass087, C892646i c892646i, long j) {
        this.A04 = c016807u;
        this.A03 = anonymousClass087;
        this.A05 = c892646i;
        this.A01 = j;
    }

    public void A00(C09P c09p, CharSequence charSequence) {
        int i = ((AbstractC016907v) this.A04).A00;
        ArrayList arrayList = new ArrayList();
        InterfaceC020509l A0f = AnonymousClass088.A0f(charSequence.toString());
        if (arrayList.size() == 0) {
            arrayList.add(A0f);
            C25031Du.A00(i, c09p, new C021109r(arrayList), this.A03);
            return;
        }
        throw new IllegalArgumentException("arguments have to be continuous");
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.A05.A05 = charSequence.toString();
        C016807u c016807u = this.A04;
        C09P AA3 = c016807u.AA3(AnonymousClass466.A0E);
        if (AA3 != null) {
            long j = this.A01;
            if (j <= 0) {
                int i4 = ((AbstractC016907v) c016807u).A00;
                ArrayList arrayList = new ArrayList();
                InterfaceC020509l A0f = AnonymousClass088.A0f(charSequence.toString());
                if (arrayList.size() == 0) {
                    arrayList.add(A0f);
                    C25031Du.A00(i4, AA3, new C021109r(arrayList), this.A03);
                    return;
                }
                throw new IllegalArgumentException("arguments have to be continuous");
            }
            Runnable runnable = this.A00;
            if (runnable != null) {
                this.A02.removeCallbacks(runnable);
            }
            RunnableC56672no runnableC56672no = new RunnableC56672no(this, AA3, charSequence);
            this.A00 = runnableC56672no;
            this.A02.postDelayed(runnableC56672no, j);
            return;
        }
        C09P AA32 = c016807u.AA3(AnonymousClass466.A0F);
        if (AA32 == null) {
            return;
        }
        int i5 = ((AbstractC016907v) c016807u).A00;
        ArrayList arrayList2 = new ArrayList();
        InterfaceC020509l A0f2 = AnonymousClass088.A0f(c016807u);
        if (arrayList2.size() == 0) {
            arrayList2.add(A0f2);
            C25031Du.A00(i5, AA32, new C021109r(arrayList2), this.A03);
            return;
        }
        throw new IllegalArgumentException("arguments have to be continuous");
    }
}

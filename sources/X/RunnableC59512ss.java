package X;

import com.whatsapp.conversationslist.ConversationsFragment;

/* renamed from: X.2ss  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC59512ss extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C471429u A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ RunnableC59512ss(C471429u c471429u, String str, int i, String str2) {
        this.A01 = c471429u;
        this.A02 = str;
        this.A00 = i;
        this.A03 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C471429u c471429u = this.A01;
        String str = this.A02;
        int i = this.A00;
        String str2 = this.A03;
        ConversationsFragment conversationsFragment = c471429u.A04;
        conversationsFragment.A07.setProgress(i);
        conversationsFragment.A0A.setText(str2);
        conversationsFragment.A09.setText(str);
    }
}

package X;

import com.whatsapp.profile.ProfileInfoActivity;

/* renamed from: X.3Su  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC70573Su extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ ProfileInfoActivity A00;

    public /* synthetic */ RunnableC70573Su(ProfileInfoActivity profileInfoActivity) {
        this.A00 = profileInfoActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.finishAfterTransition();
    }
}

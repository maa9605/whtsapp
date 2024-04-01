package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.WaTextView;
import com.whatsapp.conversation.conversationrow.components.ViewOnceDownloadProgressView;
import com.whatsapp.util.Log;

/* renamed from: X.2XO  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2XO extends C2XP {
    public C018608r A00;
    public final View A01;
    public final WaTextView A02;
    public final WaTextView A03;
    public final ViewOnceDownloadProgressView A04;

    public C2XO(Context context, AnonymousClass097 anonymousClass097) {
        super(context, anonymousClass097);
        this.A02 = (WaTextView) C0AT.A0D(this, R.id.view_once_file_size);
        this.A03 = (WaTextView) C0AT.A0D(this, R.id.view_once_media_type_large);
        this.A01 = C0AT.A0D(this, R.id.view_once_media_container_large);
        this.A04 = (ViewOnceDownloadProgressView) C0AT.A0D(this, R.id.view_once_download_large);
        A0n();
    }

    @Override // X.AbstractC48182Ef
    public void A0N() {
        ActivityC02290Ap activityC02290Ap;
        if (((C2JE) this).A02 == null || RequestPermissionActivity.A0Q(getContext(), ((C2JE) this).A02)) {
            final AnonymousClass097 fMessage = getFMessage();
            if (!fMessage.A1F()) {
                Log.w("conversation/row/viewOnce/no file");
                if (A0m() || (activityC02290Ap = (ActivityC02290Ap) C02180Ae.A0G(getContext(), ActivityC02290Ap.class)) == null) {
                    return;
                }
                ((AbstractC48202Eh) this).A0M.A03(activityC02290Ap);
                return;
            }
            AnonymousClass317 A09 = C40841sx.A09(getContext());
            A09.A07 = true;
            AnonymousClass094 anonymousClass094 = fMessage.A0n;
            AbstractC005302j abstractC005302j = anonymousClass094.A00;
            if (abstractC005302j != null) {
                A09.A03 = abstractC005302j;
                A09.A04 = anonymousClass094;
                A09.A00 = 3;
                getContext().startActivity(A09.A00());
                final C018608r c018608r = this.A00;
                if (c018608r != null) {
                    C000700j.A07(C0DB.A0E(fMessage.A0m));
                    ((C09C) fMessage).AU7(1);
                    c018608r.A1B.AS1(new Runnable() { // from class: X.1J2
                        @Override // java.lang.Runnable
                        public final void run() {
                            final C018608r c018608r2 = C018608r.this;
                            final AnonymousClass092 anonymousClass092 = fMessage;
                            C000200d.A1I(C000200d.A0P("UserActions/update view once/"), anonymousClass092.A0p);
                            C013006h c013006h = c018608r2.A0f;
                            C000700j.A00();
                            C000700j.A07(anonymousClass092 instanceof C09C);
                            c013006h.A02(anonymousClass092.A0p, ((C09C) anonymousClass092).ADw(), c013006h.A01.A01("INSERT OR REPLACE INTO message_view_once_media (message_row_id, state) VALUES (?, ?)"));
                            C018508q c018508q = c018608r2.A04;
                            c018508q.A02.post(new Runnable() { // from class: X.1JA
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C018608r c018608r3 = C018608r.this;
                                    AnonymousClass092 anonymousClass0922 = anonymousClass092;
                                    c018608r3.A0b.A05(anonymousClass0922, anonymousClass0922.A0n.A02 ? 9 : 25);
                                }
                            });
                        }
                    });
                    return;
                }
                throw null;
            }
            throw null;
        }
    }

    @Override // X.C2JH
    public void A0n() {
        int ADw = ((C09C) getFMessage()).ADw();
        if (ADw == 0) {
            ((C2JH) this).A01.setVisibility(8);
            AnonymousClass097 fMessage = getFMessage();
            int A01 = C0DB.A01(fMessage);
            setTransitionNames(fMessage);
            C2JH.A00(this.A04, fMessage, A01, false);
            A0r(this.A01, A01, false);
        } else if (ADw == 1) {
            this.A01.setVisibility(8);
            A0p();
            ((C2JH) this).A02.setText(getContext().getString(R.string.view_once_opened));
        } else if (ADw == 2) {
            this.A01.setVisibility(8);
            A0p();
            ((C2JH) this).A02.setText(getContext().getString(R.string.view_once_expired));
        }
    }

    @Override // X.C2JH
    public void A0r(View view, int i, boolean z) {
        super.A0r(view, i, z);
        if (i == 2) {
            this.A02.setVisibility(8);
            return;
        }
        AnonymousClass097 fMessage = getFMessage();
        WaTextView waTextView = this.A02;
        waTextView.setText(C0DB.A07(((AbstractC48202Eh) this).A0J, fMessage.A01));
        waTextView.setVisibility(0);
    }

    @Override // X.C2JH
    public int getDateCompensationMarginSize() {
        ViewGroup viewGroup = this.A1C;
        viewGroup.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        return getContext().getResources().getDimensionPixelSize(R.dimen.conversationRowViewOnce_date_paddingLeft) + viewGroup.getMeasuredWidth();
    }

    private void setTransitionNames(AnonymousClass097 anonymousClass097) {
        C0AT.A0e(this.A1E, C2JE.A02(anonymousClass097));
        ImageView imageView = this.A1D;
        if (imageView != null) {
            C0AT.A0e(imageView, C2JE.A07(anonymousClass097));
        }
    }
}

package X;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.mentions.MentionableEntry;

/* renamed from: X.4Fb */
/* loaded from: classes3.dex */
public class C91474Fb implements C3ZU {
    public View.OnFocusChangeListener A00;
    public View A01;
    public ImageButton A02;
    public EmojiSearchContainer A03;
    public MentionableEntry A04;
    public C4FZ A05;
    public final Context A06;
    public final TextWatcher A07 = new C2JT() { // from class: X.4Fa
        {
            C91474Fb.this = this;
        }

        @Override // X.C2JT, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            C91474Fb c91474Fb = C91474Fb.this;
            Context context = c91474Fb.A06;
            C40081rY c40081rY = c91474Fb.A0A;
            C02E c02e = c91474Fb.A08;
            C02O c02o = c91474Fb.A0B;
            MentionableEntry mentionableEntry = c91474Fb.A04;
            if (mentionableEntry != null) {
                AnonymousClass029.A17(context, c40081rY, c02e, c02o, editable, mentionableEntry.getPaint());
                return;
            }
            throw null;
        }
    };
    public final C02E A08;
    public final C002301c A09;
    public final C40081rY A0A;
    public final C02O A0B;

    @Override // X.C3ZU
    public /* synthetic */ void AEh(ViewStub viewStub) {
        C3ZT.A00(this, viewStub);
    }

    public C91474Fb(Context context, C40081rY c40081rY, C02E c02e, C002301c c002301c, C02O c02o, C4FZ c4fz) {
        this.A06 = context;
        this.A0A = c40081rY;
        this.A08 = c02e;
        this.A09 = c002301c;
        this.A0B = c02o;
        this.A05 = c4fz;
    }

    public /* synthetic */ void A00(View view, boolean z) {
        View.OnFocusChangeListener onFocusChangeListener = this.A00;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z);
        }
    }

    @Override // X.C3ZU
    public void A5h(Object obj) {
        this.A04.setText((String) obj);
    }

    @Override // X.C3ZU
    public int AAr() {
        return R.layout.shared_payment_entry;
    }

    @Override // X.C3ZU
    public void AQO(View view) {
        this.A02 = (ImageButton) C0AT.A0D(view, R.id.emoji_picker_btn);
        this.A04 = (MentionableEntry) C0AT.A0D(view, R.id.send_payment_note);
        this.A01 = C0AT.A0D(view, R.id.text_entry_layout);
        this.A03 = (EmojiSearchContainer) C0AT.A0D(view, R.id.emoji_search_container);
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.payment_entry_action_stub);
        if (viewStub != null) {
            this.A05.AEh(viewStub);
        } else {
            this.A05.AQO(C0AT.A0D(view, R.id.payment_entry_action_inflated));
        }
        this.A04.addTextChangedListener(this.A07);
        this.A04.setHint(view.getContext().getString(R.string.send_payment_note));
        this.A04.setFilters(new InputFilter[]{new InputFilter.LengthFilter(1024)});
        this.A04.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: X.3SF
            {
                C91474Fb.this = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                C91474Fb.this.A00(view2, z);
            }
        });
        this.A04.addTextChangedListener(new C52662b7(this.A0A, this.A08, this.A09, this.A0B, this.A04, (TextView) C0AT.A0D(view, R.id.counter), 1024, 30, true));
    }
}

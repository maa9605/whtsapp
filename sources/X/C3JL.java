package X;

import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.group.GroupChatInfo;
import com.whatsapp.text.ReadMoreTextView;
import com.whatsapp.util.ViewOnClickCListenerShape12S0100000_I1;

/* renamed from: X.3JL  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3JL extends C37Y {
    public C06C A00;
    public final C01B A01;
    public final C02E A02;
    public final C05M A03;
    public final C40081rY A04;
    public final C02O A05;
    public final C2MH A06;
    public final boolean A07;

    public C3JL(Conversation conversation, C2MH c2mh, C05M c05m, C40081rY c40081rY, C01B c01b, C02E c02e, C02O c02o, C06C c06c, ViewGroup viewGroup, boolean z) {
        super(conversation, viewGroup, 10);
        this.A06 = c2mh;
        this.A03 = c05m;
        this.A04 = c40081rY;
        this.A01 = c01b;
        this.A02 = c02e;
        this.A05 = c02o;
        this.A00 = c06c;
        this.A07 = z;
    }

    public final void A06() {
        ViewGroup viewGroup = ((C37Y) this).A01;
        viewGroup.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I1(this, 7));
        ReadMoreTextView readMoreTextView = (ReadMoreTextView) viewGroup.findViewById(R.id.group_description_text);
        readMoreTextView.A03 = new C3ZD() { // from class: X.37U
            @Override // X.C3ZD
            public final boolean AIV() {
                C3JL c3jl = C3JL.this;
                GroupChatInfo.A00(c3jl.A00, ((C2J9) c3jl).A01);
                return true;
            }
        };
        C02E c02e = this.A02;
        C02O c02o = this.A05;
        String str = this.A00.A0B.A02;
        Conversation conversation = ((C2J9) this).A01;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AnonymousClass029.A0Q(c02e, c02o, C002701i.A0d(str, conversation, readMoreTextView.getPaint(), this.A04)));
        this.A06.A01(conversation, spannableStringBuilder);
        readMoreTextView.A06(spannableStringBuilder, null, false, 0);
    }
}

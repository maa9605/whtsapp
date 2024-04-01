package X;

import android.app.Activity;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.InterceptingEditText;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.util.ViewOnClickCListenerShape9S0100000_I0_1;

/* renamed from: X.3AX  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3AX {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C002301c A01;
    public final /* synthetic */ C40081rY A02;
    public final /* synthetic */ C48362Ey A03;
    public final /* synthetic */ C47682Ce A04;
    public final /* synthetic */ EmojiSearchContainer A05;
    public final /* synthetic */ AnonymousClass223 A06;
    public final /* synthetic */ C02O A07;

    public /* synthetic */ C3AX(AnonymousClass223 anonymousClass223, C48362Ey c48362Ey, EmojiSearchContainer emojiSearchContainer, Activity activity, C40081rY c40081rY, C47682Ce c47682Ce, C002301c c002301c, C02O c02o) {
        this.A06 = anonymousClass223;
        this.A03 = c48362Ey;
        this.A05 = emojiSearchContainer;
        this.A00 = activity;
        this.A02 = c40081rY;
        this.A04 = c47682Ce;
        this.A01 = c002301c;
        this.A07 = c02o;
    }

    public final void A00(C2MI c2mi) {
        final AnonymousClass223 anonymousClass223 = this.A06;
        C48362Ey c48362Ey = this.A03;
        final EmojiSearchContainer emojiSearchContainer = this.A05;
        Activity activity = this.A00;
        C40081rY c40081rY = this.A02;
        C47682Ce c47682Ce = this.A04;
        C002301c c002301c = this.A01;
        C02O c02o = this.A07;
        c48362Ey.A04(c48362Ey.A0I);
        c48362Ey.A0B = anonymousClass223;
        InterfaceC54632j6 interfaceC54632j6 = new InterfaceC54632j6() { // from class: X.3AW
            @Override // X.InterfaceC54632j6
            public final void AJk(C2CI c2ci, int i) {
                InterfaceC04830Lz interfaceC04830Lz = AnonymousClass223.this.A00;
                if (interfaceC04830Lz != null) {
                    interfaceC04830Lz.AJj(c2ci);
                }
            }
        };
        emojiSearchContainer.A00 = activity;
        emojiSearchContainer.A06 = c40081rY;
        emojiSearchContainer.A05 = c002301c;
        emojiSearchContainer.A07 = c47682Ce;
        emojiSearchContainer.A09 = c2mi;
        emojiSearchContainer.A0A = interfaceC54632j6;
        emojiSearchContainer.A0B = c02o;
        if (!emojiSearchContainer.A0D) {
            emojiSearchContainer.A0D = true;
            activity.getLayoutInflater().inflate(R.layout.emoji_search, (ViewGroup) emojiSearchContainer, true);
            emojiSearchContainer.A02 = emojiSearchContainer.findViewById(R.id.no_results);
            emojiSearchContainer.A03 = (RecyclerView) emojiSearchContainer.findViewById(R.id.search_result);
            final int dimensionPixelSize = emojiSearchContainer.getResources().getDimensionPixelSize(R.dimen.selected_contacts_top_offset);
            emojiSearchContainer.A03.A0k(new AbstractC08920cK() { // from class: X.3Aa
                @Override // X.AbstractC08920cK
                public void A01(Rect rect, View view, RecyclerView recyclerView, C0Y0 c0y0) {
                    int i = dimensionPixelSize;
                    rect.set(0, i, i, i);
                }
            });
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
            linearLayoutManager.A1Y(0);
            emojiSearchContainer.A03.setLayoutManager(linearLayoutManager);
            emojiSearchContainer.A01 = emojiSearchContainer.findViewById(R.id.progress_container);
            InterceptingEditText interceptingEditText = (InterceptingEditText) emojiSearchContainer.findViewById(R.id.search_bar);
            emojiSearchContainer.A04 = interceptingEditText;
            interceptingEditText.setHint(activity.getString(R.string.emoji_search_hint));
            View findViewById = emojiSearchContainer.findViewById(R.id.clear_search_btn);
            findViewById.setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_1(emojiSearchContainer, 12));
            emojiSearchContainer.setOnTouchListener(new View.OnTouchListener() { // from class: X.2uy
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return true;
                }
            });
            InterceptingEditText interceptingEditText2 = emojiSearchContainer.A04;
            interceptingEditText2.A00 = new InterfaceC26771Kp() { // from class: X.3AY
                @Override // X.InterfaceC26771Kp
                public final void AHh() {
                    AnonymousClass223.this.A02();
                }
            };
            interceptingEditText2.addTextChangedListener(new C49342Jr(emojiSearchContainer, findViewById));
            emojiSearchContainer.findViewById(R.id.back).setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_1(anonymousClass223));
            ((ImageView) emojiSearchContainer.findViewById(R.id.back)).setImageDrawable(new C0We(c002301c, C02160Ac.A03(emojiSearchContainer.getContext(), R.drawable.ic_emoji_search_back)));
        }
        emojiSearchContainer.setVisibility(0);
        emojiSearchContainer.A02.setVisibility(0);
        emojiSearchContainer.A01.setVisibility(8);
        final Activity activity2 = emojiSearchContainer.A00;
        final C40081rY c40081rY2 = emojiSearchContainer.A06;
        final C002301c c002301c2 = emojiSearchContainer.A05;
        final InterfaceC54632j6 interfaceC54632j62 = new InterfaceC54632j6() { // from class: X.3AV
            @Override // X.InterfaceC54632j6
            public final void AJk(C2CI c2ci, int i) {
                EmojiSearchContainer emojiSearchContainer2 = EmojiSearchContainer.this;
                emojiSearchContainer2.A07.A0A(c2ci.A00);
                emojiSearchContainer2.A0A.AJk(c2ci, i);
            }
        };
        final C02O c02o2 = emojiSearchContainer.A0B;
        final int dimensionPixelSize2 = emojiSearchContainer.getResources().getDimensionPixelSize(R.dimen.emoji_picker_item);
        C3AZ c3az = new C3AZ(activity2, c40081rY2, c002301c2, interfaceC54632j62, c02o2, dimensionPixelSize2) { // from class: X.3K1
            @Override // X.C2IR
            public void AOG(C61512wH c61512wH) {
                if (c61512wH.equals(((C3AZ) this).A00)) {
                    ((AbstractC04890Mh) this).A01.A00();
                }
                EmojiSearchContainer emojiSearchContainer2 = EmojiSearchContainer.this;
                emojiSearchContainer2.A01.setVisibility(8);
                emojiSearchContainer2.A02.setVisibility(emojiSearchContainer2.A08.A0C() == 0 ? 0 : 8);
            }
        };
        emojiSearchContainer.A08 = c3az;
        emojiSearchContainer.A03.setAdapter(c3az);
        emojiSearchContainer.A0C = "";
        emojiSearchContainer.A00("");
        emojiSearchContainer.A04.setText("");
        emojiSearchContainer.A04.requestFocus();
        emojiSearchContainer.A04.A02(false);
        C0M1 c0m1 = anonymousClass223.A01;
        if (c0m1 != null) {
            Conversation conversation = (Conversation) c0m1;
            conversation.A0X.setTranscriptMode(2);
            conversation.A4Q.sendEmptyMessageDelayed(0, 1000L);
        }
    }
}

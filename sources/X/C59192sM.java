package X;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape1S0201000_I1;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.2sM  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C59192sM extends BaseAdapter {
    public UserJid A00;
    public final int A01;
    public final /* synthetic */ MessageDetailsActivity A02;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 1;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public C59192sM(MessageDetailsActivity messageDetailsActivity) {
        this.A02 = messageDetailsActivity;
        this.A01 = messageDetailsActivity.getResources().getInteger(17694721);
    }

    public final void A00(int i, View view) {
        int i2;
        MessageDetailsActivity messageDetailsActivity = this.A02;
        ArrayList arrayList = messageDetailsActivity.A0b;
        C59202sN c59202sN = (C59202sN) arrayList.get(i);
        View findViewById = view.findViewById(R.id.section_header);
        if (i != 0 && c59202sN.A00() == ((C59202sN) arrayList.get(i - 1)).A00()) {
            findViewById.setVisibility(8);
        } else {
            findViewById.setVisibility(0);
            TextView textView = (TextView) view.findViewById(R.id.section_title);
            TextView textView2 = (TextView) view.findViewById(R.id.section_icon);
            int A00 = c59202sN.A00();
            if (A00 == 5) {
                textView.setText(R.string.message_delivered_to);
                textView2.setCompoundDrawablesWithIntrinsicBounds(C02180Ae.A0O(view.getContext(), R.drawable.msg_status_client, R.color.msgStatusTint), (Drawable) null, (Drawable) null, (Drawable) null);
            } else if (A00 == 8) {
                C59212sO A002 = C59212sO.A00(false, messageDetailsActivity.A0P);
                textView.setText(A002.A02);
                textView2.setCompoundDrawablesWithIntrinsicBounds(C02180Ae.A0O(view.getContext(), A002.A01, A002.A00), (Drawable) null, (Drawable) null, (Drawable) null);
            } else if (A00 == 13) {
                byte b = messageDetailsActivity.A0P.A0m;
                int i3 = R.string.message_seen_by;
                if (b == 0) {
                    i3 = R.string.message_read_by;
                }
                textView.setText(i3);
                textView2.setCompoundDrawablesWithIntrinsicBounds(C02180Ae.A0O(view.getContext(), R.drawable.msg_status_client, R.color.msgStatusReadTint), (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }
        View findViewById2 = view.findViewById(R.id.divider);
        View findViewById3 = view.findViewById(R.id.content);
        if (i != arrayList.size() - 1 && c59202sN.A00() == ((C59202sN) arrayList.get(i + 1)).A00()) {
            findViewById3.setBackgroundResource(R.drawable.panel_mid);
            findViewById2.setVisibility(0);
        } else {
            findViewById3.setBackgroundResource(R.drawable.panel_bot);
            findViewById2.setVisibility(8);
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.contact_photo);
        C06030Rg c06030Rg = new C06030Rg(view, (int) R.id.contact_name, messageDetailsActivity.A0A, messageDetailsActivity.A0R);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) view.findViewById(R.id.push_name);
        TextView textView3 = (TextView) view.findViewById(R.id.remaining);
        View findViewById4 = view.findViewById(R.id.date_time_delivered_group);
        View findViewById5 = view.findViewById(R.id.date_time_read_group);
        View findViewById6 = view.findViewById(R.id.date_time_played_group);
        TextView textView4 = (TextView) view.findViewById(R.id.date_time_delivered);
        TextView textView5 = (TextView) view.findViewById(R.id.date_time_read);
        TextView textView6 = (TextView) view.findViewById(R.id.date_time_played);
        View findViewById7 = view.findViewById(R.id.date_time_delivered_label);
        View findViewById8 = view.findViewById(R.id.date_time_read_label);
        View findViewById9 = view.findViewById(R.id.date_time_played_label);
        findViewById4.setVisibility(8);
        findViewById5.setVisibility(8);
        findViewById6.setVisibility(8);
        findViewById7.setVisibility(8);
        findViewById8.setVisibility(8);
        findViewById9.setVisibility(8);
        if (c59202sN instanceof C39D) {
            textView3.setVisibility(0);
            imageView.setVisibility(8);
            c06030Rg.A01.setVisibility(8);
            textEmojiLabel.setVisibility(8);
            C002301c c002301c = ((ActivityC02310Ar) messageDetailsActivity).A01;
            int i4 = ((C39D) c59202sN).A00;
            textView3.setText(c002301c.A0A(R.plurals.participants_remaining, i4, Integer.valueOf(i4)));
            view.setTag(null);
            findViewById3.setOnClickListener(null);
            return;
        }
        C06C A0A = messageDetailsActivity.A08.A0A(c59202sN.A01);
        textView3.setVisibility(8);
        imageView.setVisibility(0);
        C0Zn c0Zn = messageDetailsActivity.A0C;
        c0Zn.A04(A0A, imageView, false, new C52352aa(c0Zn.A04.A02, A0A));
        c06030Rg.A01.setVisibility(0);
        c06030Rg.A03(A0A, null);
        if (A0A.A0A()) {
            if (!A0A.A0B() && !TextUtils.isEmpty(A0A.A0O)) {
                textEmojiLabel.setVisibility(0);
                StringBuilder sb = new StringBuilder();
                sb.append("~");
                sb.append(A0A.A0O);
                textEmojiLabel.A03(sb.toString());
            } else {
                if (A0A.A0B()) {
                    if (messageDetailsActivity.A0A != null) {
                        if (!TextUtils.isEmpty(A0A.A05())) {
                            textEmojiLabel.setVisibility(0);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("~");
                            if (messageDetailsActivity.A0A != null) {
                                sb2.append(A0A.A05());
                                textEmojiLabel.A03(sb2.toString());
                            } else {
                                throw null;
                            }
                        }
                    } else {
                        throw null;
                    }
                }
                textEmojiLabel.setVisibility(8);
            }
        } else {
            textEmojiLabel.setVisibility(8);
        }
        if (A0A.A02().equals(this.A00)) {
            long A01 = c59202sN.A01(5);
            if (A01 > 0) {
                textView4.setText(MessageDetailsActivity.A00(messageDetailsActivity, A01));
                i2 = 0;
                findViewById4.setVisibility(0);
                findViewById7.setVisibility(0);
            } else {
                i2 = 0;
            }
            long A012 = c59202sN.A01(13);
            if (A012 > 0) {
                textView5.setText(MessageDetailsActivity.A00(messageDetailsActivity, A012));
                findViewById5.setVisibility(i2);
                findViewById8.setVisibility(i2);
            }
            long A013 = c59202sN.A01(8);
            if (A013 > 0) {
                textView6.setText(MessageDetailsActivity.A00(messageDetailsActivity, A013));
                findViewById6.setVisibility(i2);
                findViewById9.setVisibility(i2);
            }
        } else {
            int A003 = c59202sN.A00();
            if (A003 != 5) {
                if (A003 == 8) {
                    textView6.setText(MessageDetailsActivity.A00(messageDetailsActivity, c59202sN.A01(8)));
                    findViewById6.setVisibility(0);
                } else if (A003 == 13) {
                    textView5.setText(MessageDetailsActivity.A00(messageDetailsActivity, c59202sN.A01(13)));
                    findViewById5.setVisibility(0);
                }
            } else {
                textView4.setText(MessageDetailsActivity.A00(messageDetailsActivity, c59202sN.A01(5)));
                findViewById4.setVisibility(0);
            }
        }
        view.setTag(A0A.A02());
        findViewById3.setOnClickListener(new ViewOnClickEBaseShape1S0201000_I1(this, i, view, 2));
    }

    public final void A01(int i, View view, boolean z) {
        TranslateAnimation translateAnimation;
        AlphaAnimation alphaAnimation;
        TranslateAnimation translateAnimation2;
        TranslateAnimation translateAnimation3;
        MessageDetailsActivity messageDetailsActivity = this.A02;
        View findViewById = view.findViewById(R.id.date_time_delivered);
        View findViewById2 = view.findViewById(R.id.date_time_read);
        View findViewById3 = view.findViewById(R.id.date_time_played);
        View findViewById4 = view.findViewById(R.id.date_time_delivered_label);
        View findViewById5 = view.findViewById(R.id.date_time_read_label);
        View findViewById6 = view.findViewById(R.id.date_time_played_label);
        View findViewById7 = view.findViewById(R.id.date_time_delivered_group);
        View findViewById8 = view.findViewById(R.id.date_time_read_group);
        View findViewById9 = view.findViewById(R.id.date_time_played_group);
        ArrayList arrayList = new ArrayList(6);
        int A00 = ((C59202sN) messageDetailsActivity.A0b.get(i)).A00();
        if (A00 == 5) {
            arrayList.add(findViewById4);
            if (((ActivityC02310Ar) messageDetailsActivity).A01.A0M()) {
                if (z) {
                    translateAnimation = new TranslateAnimation(findViewById.getWidth() - findViewById7.getWidth(), 0.0f, 0.0f, 0.0f);
                } else {
                    translateAnimation = new TranslateAnimation(findViewById4.getWidth(), 0.0f, 0.0f, 0.0f);
                }
                translateAnimation.setDuration(this.A01);
                translateAnimation.setInterpolator(new DecelerateInterpolator());
                findViewById.startAnimation(translateAnimation);
            }
        } else if (A00 == 8) {
            arrayList.add(findViewById6);
            arrayList.add(findViewById8);
            arrayList.add(findViewById5);
            arrayList.add(findViewById7);
            arrayList.add(findViewById4);
            if (((ActivityC02310Ar) messageDetailsActivity).A01.A0M()) {
                if (z) {
                    translateAnimation2 = new TranslateAnimation(findViewById3.getWidth() - findViewById9.getWidth(), 0.0f, 0.0f, 0.0f);
                } else {
                    translateAnimation2 = new TranslateAnimation(findViewById6.getWidth(), 0.0f, 0.0f, 0.0f);
                }
                translateAnimation2.setDuration(this.A01);
                translateAnimation2.setInterpolator(new DecelerateInterpolator());
                findViewById3.startAnimation(translateAnimation2);
            }
        } else if (A00 == 13) {
            arrayList.add(findViewById5);
            arrayList.add(findViewById7);
            arrayList.add(findViewById4);
            if (((ActivityC02310Ar) messageDetailsActivity).A01.A0M()) {
                if (z) {
                    translateAnimation3 = new TranslateAnimation(findViewById2.getWidth() - findViewById8.getWidth(), 0.0f, 0.0f, 0.0f);
                } else {
                    translateAnimation3 = new TranslateAnimation(findViewById5.getWidth(), 0.0f, 0.0f, 0.0f);
                }
                translateAnimation3.setDuration(this.A01);
                translateAnimation3.setInterpolator(new DecelerateInterpolator());
                findViewById2.startAnimation(translateAnimation3);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            View view2 = (View) it.next();
            if (z) {
                alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                int i2 = this.A01;
                alphaAnimation.setDuration(i2);
                alphaAnimation.setStartOffset(i2 * 0.0f);
            } else {
                alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                int i3 = this.A01;
                alphaAnimation.setDuration(i3);
                alphaAnimation.setStartOffset(i3 * 0.0f);
            }
            view2.startAnimation(alphaAnimation);
        }
        final View findViewById10 = view.findViewById(R.id.timestamps);
        final int height = findViewById10.getHeight();
        A00(i, view);
        findViewById10.measure(View.MeasureSpec.makeMeasureSpec(findViewById10.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        final int measuredHeight = findViewById10.getMeasuredHeight();
        findViewById10.getLayoutParams().height = height;
        Animation animation = new Animation() { // from class: X.2sL
            @Override // android.view.animation.Animation
            public boolean willChangeBounds() {
                return true;
            }

            @Override // android.view.animation.Animation
            public void applyTransformation(float f, Transformation transformation) {
                View view3;
                if (f == 1.0f) {
                    view3 = findViewById10;
                    view3.getLayoutParams().height = -2;
                } else {
                    view3 = findViewById10;
                    ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                    int i4 = height;
                    layoutParams.height = i4 + ((int) ((measuredHeight - i4) * f));
                }
                view3.requestLayout();
            }
        };
        animation.setDuration(this.A01);
        findViewById10.startAnimation(animation);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.A02.A0b.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.A02.A0b.get(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.A02.getLayoutInflater().inflate(R.layout.message_details_row, viewGroup, false);
        }
        A00(i, view);
        return view;
    }
}

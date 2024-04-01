package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Html;
import android.text.Spannable;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape0S0200000_I0_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.conversation.conversationrow.DynamicButtonsLayout;
import com.whatsapp.conversation.conversationrow.DynamicButtonsRowContentLayout;
import com.whatsapp.conversation.conversationrow.TemplateQuickReplyButtonsLayout;
import com.whatsapp.conversation.conversationrow.TemplateRowContentLayout;
import com.whatsapp.data.ProfilePhotoChange;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2rm */
/* loaded from: classes2.dex */
public class C58832rm {
    public C0Zn A00;
    public C43791xz A01;
    public C23K A02;
    public List A03;
    public final C01B A04;
    public final C06K A05;
    public final C05W A06;
    public final C011505r A07;
    public final C0L5 A08;
    public final C42381ve A09;
    public final C03120Eg A0A;
    public final C001200o A0B;
    public final C002301c A0C;
    public final C003701t A0D;
    public final C40951t8 A0E;

    public C58832rm(C003701t c003701t, C001200o c001200o, C01B c01b, C40951t8 c40951t8, C0L5 c0l5, C05W c05w, C002301c c002301c, C011505r c011505r, C06K c06k, C43791xz c43791xz, C42381ve c42381ve, C03120Eg c03120Eg) {
        this.A0D = c003701t;
        this.A0B = c001200o;
        this.A04 = c01b;
        this.A0E = c40951t8;
        this.A08 = c0l5;
        this.A06 = c05w;
        this.A0C = c002301c;
        this.A07 = c011505r;
        this.A05 = c06k;
        this.A01 = c43791xz;
        this.A09 = c42381ve;
        this.A0A = c03120Eg;
    }

    public static int A00(AnonymousClass092 anonymousClass092) {
        byte b = anonymousClass092.A0m;
        switch (b) {
            case 0:
                if (anonymousClass092 instanceof C04300Jq) {
                    int i = ((C04300Jq) anonymousClass092).A00;
                    boolean z = anonymousClass092.A0n.A02;
                    if (z && i == 6) {
                        if (((C04390Jz) anonymousClass092).A00 != null) {
                            return 19;
                        }
                    } else if (i == 41 || i == 40 || i == 42 || i == 64 || i == 65) {
                        return 40;
                    }
                    return !z ? 15 : 6;
                } else if (anonymousClass092.A0F != null) {
                    return anonymousClass092.A0n.A02 ? 35 : 36;
                } else {
                    boolean A11 = anonymousClass092.A11();
                    boolean z2 = anonymousClass092.A0n.A02;
                    return A11 ? z2 ? 73 : 74 : z2 ? 0 : 9;
                }
            case 1:
                boolean A112 = anonymousClass092.A11();
                boolean z3 = anonymousClass092.A0n.A02;
                return A112 ? z3 ? 77 : 78 : !z3 ? 10 : 1;
            case 2:
                int i2 = anonymousClass092.A04;
                boolean z4 = anonymousClass092.A0n.A02;
                return i2 == 1 ? z4 ? 7 : 16 : z4 ? 2 : 11;
            case 3:
                if (anonymousClass092.A11()) {
                    return anonymousClass092.A0n.A02 ? 75 : 76;
                } else if (anonymousClass092.A0n.A02) {
                    return 3;
                } else {
                    return C0DB.A0b(anonymousClass092) ? 12 : 23;
                }
            case 4:
                return !anonymousClass092.A0n.A02 ? 14 : 5;
            case 5:
                boolean A113 = anonymousClass092.A11();
                boolean z5 = anonymousClass092.A0n.A02;
                return A113 ? z5 ? 81 : 82 : z5 ? 4 : 13;
            case 6:
            case 7:
            case 8:
            case 17:
            case 18:
            case 33:
            case 34:
            case 35:
            case 38:
            case 39:
            case 40:
            case 41:
            case 47:
            case 48:
            case 50:
            default:
                if (anonymousClass092.A08 == -1 && b == -1) {
                    return !anonymousClass092.A0n.A02 ? 15 : 6;
                }
                return -1;
            case 9:
                if (C0DB.A0d(anonymousClass092)) {
                    int A04 = C02180Ae.A04(anonymousClass092);
                    boolean z6 = anonymousClass092.A0n.A02;
                    return A04 == 1 ? !z6 ? 14 : 5 : z6 ? 28 : 29;
                }
                boolean A114 = anonymousClass092.A11();
                boolean z7 = anonymousClass092.A0n.A02;
                return A114 ? z7 ? 79 : 80 : !z7 ? 17 : 8;
            case 10:
                return 21;
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                if (anonymousClass092.A0F != null) {
                    return anonymousClass092.A0n.A02 ? 35 : 36;
                }
                return 20;
            case 12:
                AnonymousClass093 anonymousClass093 = anonymousClass092.A0F;
                if (anonymousClass093 == null || anonymousClass093.A02 == 5) {
                    return 22;
                }
                return anonymousClass092.A0n.A02 ? 35 : 36;
            case 13:
                return anonymousClass092.A0n.A02 ? 24 : 25;
            case 14:
                return anonymousClass092.A0n.A02 ? 28 : 29;
            case 15:
                return anonymousClass092.A0n.A02 ? 26 : 27;
            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                return anonymousClass092.A0n.A02 ? 30 : 31;
            case 19:
                return 37;
            case C0M6.A01 /* 20 */:
                return anonymousClass092.A0n.A02 ? 38 : 39;
            case 21:
                return 43;
            case 22:
                return 44;
            case 23:
                return anonymousClass092.A0n.A02 ? 45 : 46;
            case 24:
                return anonymousClass092.A0n.A02 ? 47 : 48;
            case 25:
                return anonymousClass092.A0n.A02 ? 50 : 51;
            case 26:
                return anonymousClass092.A0n.A02 ? 52 : 53;
            case 27:
                return anonymousClass092.A0n.A02 ? 54 : 55;
            case 28:
                return anonymousClass092.A0n.A02 ? 56 : 57;
            case 29:
                return anonymousClass092.A0n.A02 ? 58 : 59;
            case 30:
                return anonymousClass092.A0n.A02 ? 60 : 61;
            case 31:
                AnonymousClass093 anonymousClass0932 = anonymousClass092.A0F;
                if (anonymousClass0932 == null || anonymousClass0932.A02 == 5) {
                    return 49;
                }
                return anonymousClass092.A0n.A02 ? 35 : 36;
            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /* 32 */:
                return anonymousClass092.A0n.A02 ? 62 : 63;
            case 36:
                return 64;
            case 37:
                return !anonymousClass092.A0n.A02 ? 66 : 65;
            case 42:
            case 43:
                return anonymousClass092.A0n.A02 ? 71 : 72;
            case 44:
                return anonymousClass092.A0n.A02 ? 67 : 68;
            case 45:
            case 52:
                return anonymousClass092.A0n.A02 ? 69 : 70;
            case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /* 46 */:
            case 49:
                return anonymousClass092.A0n.A02 ? 0 : 9;
            case 51:
                return anonymousClass092.A0n.A02 ? 83 : 84;
        }
    }

    public C0Zn A01(Context context) {
        C0Zn c0Zn = this.A00;
        if (c0Zn == null) {
            C0Zn A04 = this.A08.A04(context);
            this.A00 = A04;
            return A04;
        }
        return c0Zn;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public AbstractC48182Ef A02(Context context, AnonymousClass092 anonymousClass092) {
        byte b = anonymousClass092.A0m;
        if (b == 0) {
            if (anonymousClass092 instanceof C04300Jq) {
                C04300Jq c04300Jq = (C04300Jq) anonymousClass092;
                int i = c04300Jq.A00;
                if (anonymousClass092.A0n.A02 && i == 6) {
                    if (((C04390Jz) anonymousClass092).A00 != null) {
                        return new C2X2(context, c04300Jq) { // from class: X.2X1
                            public final ImageView A00;
                            public final ImageView A01;
                            public final ImageView A02;

                            @Override // X.C2WA
                            public int getBackgroundResource() {
                                return 0;
                            }

                            {
                                super(context, c04300Jq);
                                this.A02 = (ImageView) findViewById(R.id.photo_old);
                                this.A01 = (ImageView) findViewById(R.id.photo_new);
                                ImageView imageView = (ImageView) findViewById(R.id.arrow);
                                this.A00 = imageView;
                                imageView.setImageDrawable(new C0We(((AbstractC48202Eh) this).A0J, C02160Ac.A03(context, R.drawable.ic_chat_icon_change_arrow)));
                                A02();
                            }

                            private void A02() {
                                ProfilePhotoChange profilePhotoChange;
                                byte[] bArr;
                                AbstractC12910kI abstractC12910kI;
                                AbstractC12910kI abstractC12910kI2;
                                C04300Jq fMessage = getFMessage();
                                if (fMessage.A0n.A02 && fMessage.A00 == 6 && (profilePhotoChange = ((C04390Jz) fMessage).A00) != null && (bArr = profilePhotoChange.newPhoto) != null && profilePhotoChange.oldPhoto != null) {
                                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                                    byte[] bArr2 = profilePhotoChange.oldPhoto;
                                    Bitmap decodeByteArray2 = BitmapFactory.decodeByteArray(bArr2, 0, bArr2.length);
                                    if (decodeByteArray != null && decodeByteArray2 != null) {
                                        Resources resources = getContext().getResources();
                                        if (Build.VERSION.SDK_INT >= 21) {
                                            abstractC12910kI = new AbstractC12910kI(resources, decodeByteArray2) { // from class: X.1TI
                                                @Override // X.AbstractC12910kI
                                                public void A02(int i2, int i3, int i4, Rect rect, Rect rect2) {
                                                    Gravity.apply(i2, i3, i4, rect, rect2, 0);
                                                }

                                                @Override // android.graphics.drawable.Drawable
                                                public void getOutline(Outline outline) {
                                                    A01();
                                                    outline.setRoundRect(this.A0B, this.A00);
                                                }
                                            };
                                        } else {
                                            abstractC12910kI = new AbstractC12910kI(resources, decodeByteArray2) { // from class: X.1TJ
                                                @Override // X.AbstractC12910kI
                                                public void A02(int i2, int i3, int i4, Rect rect, Rect rect2) {
                                                    C07O.A0T(i2, i3, i4, rect, rect2, 0);
                                                }
                                            };
                                        }
                                        Resources resources2 = getContext().getResources();
                                        if (Build.VERSION.SDK_INT >= 21) {
                                            abstractC12910kI2 = new AbstractC12910kI(resources2, decodeByteArray) { // from class: X.1TI
                                                @Override // X.AbstractC12910kI
                                                public void A02(int i2, int i3, int i4, Rect rect, Rect rect2) {
                                                    Gravity.apply(i2, i3, i4, rect, rect2, 0);
                                                }

                                                @Override // android.graphics.drawable.Drawable
                                                public void getOutline(Outline outline) {
                                                    A01();
                                                    outline.setRoundRect(this.A0B, this.A00);
                                                }
                                            };
                                        } else {
                                            abstractC12910kI2 = new AbstractC12910kI(resources2, decodeByteArray) { // from class: X.1TJ
                                                @Override // X.AbstractC12910kI
                                                public void A02(int i2, int i3, int i4, Rect rect, Rect rect2) {
                                                    C07O.A0T(i2, i3, i4, rect, rect2, 0);
                                                }
                                            };
                                        }
                                        abstractC12910kI.A00();
                                        abstractC12910kI2.A00();
                                        ImageView imageView = this.A02;
                                        imageView.setImageDrawable(abstractC12910kI);
                                        ImageView imageView2 = this.A01;
                                        imageView2.setImageDrawable(abstractC12910kI2);
                                        imageView.setVisibility(0);
                                        imageView2.setVisibility(0);
                                        this.A00.setVisibility(0);
                                        return;
                                    }
                                }
                                this.A02.setVisibility(8);
                                this.A01.setVisibility(8);
                                this.A00.setVisibility(8);
                            }

                            @Override // X.C2WA, X.AbstractC48182Ef
                            public void A0I() {
                                A02();
                                super.A0I();
                            }

                            @Override // X.C2WA, X.AbstractC48182Ef
                            public void A0X(AnonymousClass092 anonymousClass0922, boolean z) {
                                boolean z2 = anonymousClass0922 != getFMessage();
                                super.A0X(anonymousClass0922, z);
                                if (z || z2) {
                                    A02();
                                }
                            }

                            @Override // X.C2WA, X.AbstractC48202Eh
                            public int getCenteredLayoutId() {
                                return R.layout.conversation_row_photo_change;
                            }

                            @Override // X.C2WA, X.AbstractC48202Eh
                            public int getIncomingLayoutId() {
                                return R.layout.conversation_row_photo_change;
                            }

                            @Override // X.C2WA, X.AbstractC48202Eh
                            public int getOutgoingLayoutId() {
                                return R.layout.conversation_row_photo_change;
                            }
                        };
                    }
                } else if (i == 41 || i == 40 || i == 42 || i == 64 || i == 65) {
                    return new C51552Wx(context, c04300Jq);
                }
                return new C2WA(context, c04300Jq);
            } else if (anonymousClass092.A0F != null) {
                return new C51532Wv(context, anonymousClass092);
            } else {
                C0JJ c0jj = (C0JJ) anonymousClass092;
                if (anonymousClass092.A11()) {
                    return new C2XF(context, c0jj) { // from class: X.2XE
                        public final TextEmojiLabel A03 = (TextEmojiLabel) findViewById(R.id.title_text_message);
                        public final TextEmojiLabel A02 = (TextEmojiLabel) findViewById(R.id.button_content);
                        public final View A00 = findViewById(R.id.button_div);
                        public final View A01 = findViewById(R.id.native_flow_action_button);
                        public final DynamicButtonsLayout A04 = (DynamicButtonsLayout) findViewById(R.id.dynamic_reply_buttons);
                        public final DynamicButtonsRowContentLayout A05 = (DynamicButtonsRowContentLayout) findViewById(R.id.dynamic_reply_buttons_message_content);

                        {
                            C000200d.A0b(this.A03);
                            this.A03.setAutoLinkMask(0);
                            this.A03.setLinksClickable(false);
                            this.A03.setClickable(false);
                            this.A03.setLongClickable(false);
                            A0j();
                        }

                        @Override // X.AbstractC48182Ef
                        public void A0I() {
                            A0j();
                            A0e(false);
                        }

                        @Override // X.AbstractC48182Ef
                        public void A0X(AnonymousClass092 anonymousClass0922, boolean z) {
                            boolean z2 = anonymousClass0922 != getFMessage();
                            super.A0X(anonymousClass0922, z);
                            if (z || z2) {
                                A0j();
                            }
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:54:0x0094, code lost:
                            if (r1 == null) goto L24;
                         */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final void A0j() {
                            /*
                                r13 = this;
                                r7 = r13
                                com.whatsapp.conversation.conversationrow.DynamicButtonsRowContentLayout r0 = r13.A05
                                r0.A00(r13)
                                X.092 r1 = r13.getFMessage()
                                java.lang.String r0 = r1.A0G()
                                boolean r0 = android.text.TextUtils.isEmpty(r0)
                                r11 = 0
                                r3 = 8
                                if (r0 != 0) goto La6
                                java.lang.String r8 = r1.A0G()
                                com.whatsapp.TextEmojiLabel r9 = r13.A03
                                X.092 r10 = r13.getFMessage()
                                r12 = r11
                                r7.A0b(r8, r9, r10, r11, r12)
                                r9.setVisibility(r11)
                            L28:
                                com.whatsapp.Conversation r1 = r13.A0E()
                                r6 = 0
                                if (r1 == 0) goto L8f
                                java.util.List r2 = r13.getResponseButtons()
                                if (r2 == 0) goto L8f
                                int r0 = r2.size()
                                if (r0 <= 0) goto L8f
                                com.whatsapp.conversation.conversationrow.DynamicButtonsLayout r1 = r13.A04
                                X.37u r0 = r13.A1F
                                r1.A04(r0, r2)
                                r1.setVisibility(r11)
                            L45:
                                X.2D3 r5 = r13.getNativeFlowButton()
                                if (r5 == 0) goto L96
                                X.2Rg r1 = r5.A02
                                if (r1 == 0) goto L96
                                android.view.View r0 = r13.A00
                                r0.setVisibility(r11)
                                com.whatsapp.TextEmojiLabel r4 = r13.A02
                                r4.setVisibility(r11)
                                android.view.View r3 = r13.A01
                                r3.setVisibility(r11)
                                X.01c r2 = r13.A0J
                                java.lang.String r1 = r1.A00
                                java.lang.String r0 = "novi_hub"
                                boolean r0 = r0.equals(r1)
                                if (r0 == 0) goto L7f
                                r0 = 2131888359(0x7f1208e7, float:1.9411351E38)
                                java.lang.String r6 = r2.A06(r0)
                            L71:
                                r4.setText(r6)
                                r1 = 18
                                com.facebook.redex.ViewOnClickEBaseShape0S0200000_I0_0 r0 = new com.facebook.redex.ViewOnClickEBaseShape0S0200000_I0_0
                                r0.<init>(r13, r5, r1)
                                r3.setOnClickListener(r0)
                                return
                            L7f:
                                java.lang.String r0 = "novi_login"
                                boolean r0 = r0.equals(r1)
                                if (r0 == 0) goto L71
                                r0 = 2131888360(0x7f1208e8, float:1.9411353E38)
                                java.lang.String r6 = r2.A06(r0)
                                goto L71
                            L8f:
                                com.whatsapp.conversation.conversationrow.DynamicButtonsLayout r0 = r13.A04
                                r0.setVisibility(r3)
                                if (r1 != 0) goto L45
                            L96:
                                android.view.View r0 = r13.A00
                                r0.setVisibility(r3)
                                com.whatsapp.TextEmojiLabel r0 = r13.A02
                                r0.setVisibility(r3)
                                android.view.View r0 = r13.A01
                                r0.setVisibility(r3)
                                return
                            La6:
                                com.whatsapp.TextEmojiLabel r0 = r13.A03
                                r0.setVisibility(r3)
                                goto L28
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C2XE.A0j():void");
                        }

                        @Override // X.AbstractC48202Eh
                        public int getCenteredLayoutId() {
                            return R.layout.conversation_row_button_title_text_left;
                        }

                        @Override // X.AbstractC48202Eh
                        public int getIncomingLayoutId() {
                            return R.layout.conversation_row_button_title_text_left;
                        }

                        private C2D3 getNativeFlowButton() {
                            AnonymousClass092 fMessage = getFMessage();
                            if (fMessage.A0D().A00 == null || fMessage.A0D().A00.A02 == null) {
                                return null;
                            }
                            for (C2D3 c2d3 : fMessage.A0D().A00.A02) {
                                if (c2d3.A02 != null) {
                                    return c2d3;
                                }
                            }
                            return null;
                        }

                        @Override // X.AbstractC48202Eh
                        public int getOutgoingLayoutId() {
                            return R.layout.conversation_row_button_title_text_right;
                        }

                        private List getResponseButtons() {
                            ArrayList arrayList = new ArrayList();
                            AnonymousClass092 fMessage = getFMessage();
                            if (fMessage.A0D().A00 != null && fMessage.A0D().A00.A02 != null) {
                                for (C2D3 c2d3 : fMessage.A0D().A00.A02) {
                                    if (c2d3 != null && c2d3.A02 == null) {
                                        arrayList.add(c2d3);
                                    }
                                }
                            }
                            return arrayList;
                        }

                        @Override // X.AbstractC48182Ef, X.AbstractC48202Eh, android.view.ViewGroup, android.view.View
                        public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                            super.onLayout(z, i2, i3, i4, i5);
                            DynamicButtonsLayout dynamicButtonsLayout = this.A04;
                            dynamicButtonsLayout.layout(((AbstractC48202Eh) this).A0C.getLeft(), ((AbstractC48202Eh) this).A0C.getBottom(), ((AbstractC48202Eh) this).A0C.getRight(), ((AbstractC48202Eh) this).A0C.getBottom() + dynamicButtonsLayout.getMeasuredHeight());
                        }

                        @Override // X.AbstractC48182Ef, X.AbstractC48202Eh, android.view.View
                        public void onMeasure(int i2, int i3) {
                            super.onMeasure(i2, i3);
                            int measuredHeight = getMeasuredHeight();
                            setMeasuredDimension(getMeasuredWidth(), this.A04.A01(((AbstractC48202Eh) this).A0C.getMeasuredWidth()) + measuredHeight);
                        }
                    };
                }
                return new C2XC(context, c0jj);
            }
        } else if (b == 1) {
            AnonymousClass095 anonymousClass095 = (AnonymousClass095) anonymousClass092;
            if (anonymousClass092.A11()) {
                return new AbstractC51352Wc(context, anonymousClass095) { // from class: X.2Wb
                    public final DynamicButtonsLayout A00 = (DynamicButtonsLayout) findViewById(R.id.dynamic_reply_buttons);
                    public final DynamicButtonsRowContentLayout A01 = (DynamicButtonsRowContentLayout) findViewById(R.id.dynamic_reply_buttons_message_content);

                    {
                        A0n();
                    }

                    @Override // X.C2WX, X.AbstractC48182Ef
                    public void A0I() {
                        A0n();
                        super.A0I();
                    }

                    @Override // X.C2WX, X.AbstractC48182Ef
                    public void A0X(AnonymousClass092 anonymousClass0922, boolean z) {
                        boolean z2 = anonymousClass0922 != getFMessage();
                        super.A0X(anonymousClass0922, z);
                        if (z || z2) {
                            A0n();
                        }
                    }

                    public final void A0n() {
                        this.A01.A00(this);
                        AnonymousClass095 fMessage = getFMessage();
                        if (fMessage.A0D().A00 == null || A0E() == null) {
                            A0o(new ArrayList());
                        } else {
                            A0o(fMessage.A0D().A00.A02);
                        }
                    }

                    public final void A0o(List list) {
                        if (list == null || list.size() <= 0) {
                            this.A00.setVisibility(8);
                            return;
                        }
                        DynamicButtonsLayout dynamicButtonsLayout = this.A00;
                        dynamicButtonsLayout.A04(this.A1F, list);
                        dynamicButtonsLayout.setVisibility(0);
                    }

                    @Override // X.C2WX, X.AbstractC48202Eh
                    public int getCenteredLayoutId() {
                        return R.layout.conversation_row_buttons_image_left;
                    }

                    @Override // X.C2WX, X.AbstractC48202Eh
                    public int getIncomingLayoutId() {
                        return R.layout.conversation_row_buttons_image_left;
                    }

                    @Override // X.C2WX, X.AbstractC48202Eh
                    public int getOutgoingLayoutId() {
                        return R.layout.conversation_row_buttons_image_right;
                    }

                    @Override // X.C2WX, X.AbstractC48182Ef
                    public Drawable getStarDrawable() {
                        return C02180Ae.A0O(getContext(), R.drawable.message_star, R.color.messageStarColor);
                    }

                    @Override // X.AbstractC48182Ef, X.AbstractC48202Eh, android.view.ViewGroup, android.view.View
                    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                        super.onLayout(z, i2, i3, i4, i5);
                        DynamicButtonsLayout dynamicButtonsLayout = this.A00;
                        dynamicButtonsLayout.layout(((AbstractC48202Eh) this).A0C.getLeft(), ((AbstractC48202Eh) this).A0C.getBottom(), ((AbstractC48202Eh) this).A0C.getRight(), ((AbstractC48202Eh) this).A0C.getBottom() + dynamicButtonsLayout.getMeasuredHeight());
                    }

                    @Override // X.AbstractC48182Ef, X.AbstractC48202Eh, android.view.View
                    public void onMeasure(int i2, int i3) {
                        super.onMeasure(i2, i3);
                        int measuredHeight = getMeasuredHeight();
                        setMeasuredDimension(getMeasuredWidth(), this.A00.A01(((AbstractC48202Eh) this).A0C.getMeasuredWidth()) + measuredHeight);
                    }
                };
            }
            return new C2WX(context, anonymousClass095);
        } else if (b == 2) {
            if (anonymousClass092.A04 == 1) {
                return new C2XQ(context, (C09G) anonymousClass092, A01(context), this.A09, this.A0A);
            }
            return new C2W4(context, (C09G) anonymousClass092, this.A09, this.A0A);
        } else if (b == 3) {
            if (anonymousClass092.A11()) {
                return new C2XL(context, (C0JP) anonymousClass092) { // from class: X.2XK
                    public final DynamicButtonsLayout A00 = (DynamicButtonsLayout) findViewById(R.id.dynamic_reply_buttons);
                    public final DynamicButtonsRowContentLayout A01 = (DynamicButtonsRowContentLayout) findViewById(R.id.dynamic_reply_buttons_message_content);

                    {
                        A0o();
                    }

                    @Override // X.C2XI, X.AbstractC48182Ef
                    public void A0I() {
                        A0o();
                        super.A0I();
                    }

                    @Override // X.C2XI, X.AbstractC48182Ef
                    public void A0X(AnonymousClass092 anonymousClass0922, boolean z) {
                        boolean z2 = anonymousClass0922 != getFMessage();
                        super.A0X(anonymousClass0922, z);
                        if (z || z2) {
                            A0o();
                        }
                    }

                    public final void A0o() {
                        this.A01.A00(this);
                        C0JP fMessage = getFMessage();
                        if (fMessage.A0D().A00 == null || A0E() == null) {
                            A0p(new ArrayList());
                        } else {
                            A0p(fMessage.A0D().A00.A02);
                        }
                    }

                    public final void A0p(List list) {
                        if (list == null || list.size() <= 0) {
                            this.A00.setVisibility(8);
                            return;
                        }
                        DynamicButtonsLayout dynamicButtonsLayout = this.A00;
                        dynamicButtonsLayout.A04(this.A1F, list);
                        dynamicButtonsLayout.setVisibility(0);
                    }

                    @Override // X.C2XI, X.AbstractC48202Eh
                    public int getCenteredLayoutId() {
                        return R.layout.conversation_row_button_video_left;
                    }

                    @Override // X.C2XI, X.AbstractC48202Eh
                    public int getIncomingLayoutId() {
                        return R.layout.conversation_row_button_video_left;
                    }

                    @Override // X.C2XI, X.AbstractC48202Eh
                    public int getOutgoingLayoutId() {
                        return R.layout.conversation_row_button_video_right;
                    }

                    @Override // X.C2XI, X.AbstractC48182Ef
                    public Drawable getStarDrawable() {
                        return C02180Ae.A0O(getContext(), R.drawable.message_star, R.color.messageStarColor);
                    }

                    @Override // X.AbstractC48182Ef, X.AbstractC48202Eh, android.view.ViewGroup, android.view.View
                    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                        super.onLayout(z, i2, i3, i4, i5);
                        DynamicButtonsLayout dynamicButtonsLayout = this.A00;
                        dynamicButtonsLayout.layout(((AbstractC48202Eh) this).A0C.getLeft(), ((AbstractC48202Eh) this).A0C.getBottom(), ((AbstractC48202Eh) this).A0C.getRight(), ((AbstractC48202Eh) this).A0C.getBottom() + dynamicButtonsLayout.getMeasuredHeight());
                    }

                    @Override // X.AbstractC48182Ef, X.AbstractC48202Eh, android.view.View
                    public void onMeasure(int i2, int i3) {
                        super.onMeasure(i2, i3);
                        int measuredHeight = getMeasuredHeight();
                        setMeasuredDimension(getMeasuredWidth(), this.A00.A01(((AbstractC48202Eh) this).A0C.getMeasuredWidth()) + measuredHeight);
                    }
                };
            }
            C0JP c0jp = (C0JP) anonymousClass092;
            if (!C0DB.A0b(c0jp) && !anonymousClass092.A0n.A02) {
                return new C51382Wf(context, c0jp);
            }
            return new C2XI(context, c0jp);
        } else if (b != 4) {
            if (b == 5) {
                C0LP c0lp = (C0LP) anonymousClass092;
                if (anonymousClass092.A11()) {
                    return new AbstractC51472Wo(context, c0lp) { // from class: X.2Wn
                        public final DynamicButtonsLayout A00 = (DynamicButtonsLayout) findViewById(R.id.dynamic_reply_buttons);
                        public final DynamicButtonsRowContentLayout A01 = (DynamicButtonsRowContentLayout) findViewById(R.id.dynamic_reply_buttons_message_content);

                        {
                            A00();
                        }

                        private void A00() {
                            this.A01.A00(this);
                            C0LP fMessage = getFMessage();
                            if (fMessage.A0D().A00 == null || A0E() == null) {
                                A0k(new ArrayList());
                            } else {
                                A0k(fMessage.A0D().A00.A02);
                            }
                        }

                        @Override // X.C51442Wl, X.AbstractC48182Ef
                        public void A0I() {
                            A00();
                            super.A0I();
                        }

                        @Override // X.C51442Wl, X.AbstractC48182Ef
                        public void A0X(AnonymousClass092 anonymousClass0922, boolean z) {
                            boolean z2 = anonymousClass0922 != getFMessage();
                            super.A0X(anonymousClass0922, z);
                            if (z || z2) {
                                A00();
                            }
                        }

                        public final void A0k(List list) {
                            if (list == null || list.size() <= 0) {
                                this.A00.setVisibility(8);
                                return;
                            }
                            DynamicButtonsLayout dynamicButtonsLayout = this.A00;
                            dynamicButtonsLayout.A04(this.A1F, list);
                            dynamicButtonsLayout.setVisibility(0);
                        }

                        @Override // X.C51442Wl, X.AbstractC48202Eh
                        public int getCenteredLayoutId() {
                            return R.layout.conversation_row_buttons_location_left;
                        }

                        @Override // X.C51442Wl, X.AbstractC48202Eh
                        public int getIncomingLayoutId() {
                            return R.layout.conversation_row_buttons_location_left;
                        }

                        @Override // X.C51442Wl, X.AbstractC48202Eh
                        public int getOutgoingLayoutId() {
                            return R.layout.conversation_row_buttons_location_right;
                        }

                        @Override // X.AbstractC48182Ef, X.AbstractC48202Eh, android.view.ViewGroup, android.view.View
                        public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                            super.onLayout(z, i2, i3, i4, i5);
                            DynamicButtonsLayout dynamicButtonsLayout = this.A00;
                            dynamicButtonsLayout.layout(((AbstractC48202Eh) this).A0C.getLeft(), ((AbstractC48202Eh) this).A0C.getBottom(), ((AbstractC48202Eh) this).A0C.getRight(), ((AbstractC48202Eh) this).A0C.getBottom() + dynamicButtonsLayout.getMeasuredHeight());
                        }

                        @Override // X.AbstractC48182Ef, X.AbstractC48202Eh, android.view.View
                        public void onMeasure(int i2, int i3) {
                            super.onMeasure(i2, i3);
                            int measuredHeight = getMeasuredHeight();
                            setMeasuredDimension(getMeasuredWidth(), this.A00.A01(((AbstractC48202Eh) this).A0C.getMeasuredWidth()) + measuredHeight);
                        }
                    };
                }
                return new C51442Wl(context, c0lp);
            } else if (b != 36) {
                if (b != 49) {
                    if (b != 51) {
                        if (b != 52) {
                            switch (b) {
                                case 9:
                                    if (C0DB.A0d(anonymousClass092)) {
                                        int A04 = C02180Ae.A04(anonymousClass092);
                                        C0Zn A01 = A01(context);
                                        return A04 == 1 ? new C2W6(context, anonymousClass092, A01, A03()) : new C2W8(context, anonymousClass092, A01, A03());
                                    }
                                    C09E c09e = (C09E) anonymousClass092;
                                    if (anonymousClass092.A11()) {
                                        return new C2WF(context, c09e) { // from class: X.2WE
                                            public final DynamicButtonsLayout A00 = (DynamicButtonsLayout) findViewById(R.id.dynamic_reply_buttons);
                                            public final DynamicButtonsRowContentLayout A01 = (DynamicButtonsRowContentLayout) findViewById(R.id.dynamic_reply_buttons_message_content);

                                            {
                                                A00();
                                            }

                                            private void A00() {
                                                this.A01.A00(this);
                                                C05530Pc c05530Pc = getFMessage().A0D().A00;
                                                if (c05530Pc == null || A0E() == null) {
                                                    A0o(new ArrayList());
                                                } else {
                                                    A0o(c05530Pc.A02);
                                                }
                                            }

                                            @Override // X.C2WC, X.AbstractC48182Ef
                                            public void A0I() {
                                                A00();
                                                super.A0I();
                                            }

                                            @Override // X.C2WC, X.AbstractC48182Ef
                                            public void A0X(AnonymousClass092 anonymousClass0922, boolean z) {
                                                boolean z2 = anonymousClass0922 != getFMessage();
                                                super.A0X(anonymousClass0922, z);
                                                if (z || z2) {
                                                    A00();
                                                }
                                            }

                                            public final void A0o(List list) {
                                                if (list == null || list.size() <= 0) {
                                                    this.A00.setVisibility(8);
                                                    return;
                                                }
                                                DynamicButtonsLayout dynamicButtonsLayout = this.A00;
                                                dynamicButtonsLayout.A04(this.A1F, list);
                                                dynamicButtonsLayout.setVisibility(0);
                                            }

                                            @Override // X.C2WC, X.AbstractC48202Eh
                                            public int getCenteredLayoutId() {
                                                return R.layout.conversation_row_buttons_document_left;
                                            }

                                            @Override // X.C2WC, X.AbstractC48202Eh
                                            public int getIncomingLayoutId() {
                                                return R.layout.conversation_row_buttons_document_left;
                                            }

                                            @Override // X.C2WC, X.AbstractC48202Eh
                                            public int getOutgoingLayoutId() {
                                                return R.layout.conversation_row_buttons_document_right;
                                            }

                                            @Override // X.AbstractC48182Ef, X.AbstractC48202Eh, android.view.ViewGroup, android.view.View
                                            public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                                                super.onLayout(z, i2, i3, i4, i5);
                                                DynamicButtonsLayout dynamicButtonsLayout = this.A00;
                                                dynamicButtonsLayout.layout(((AbstractC48202Eh) this).A0C.getLeft(), ((AbstractC48202Eh) this).A0C.getBottom(), ((AbstractC48202Eh) this).A0C.getRight(), ((AbstractC48202Eh) this).A0C.getBottom() + dynamicButtonsLayout.getMeasuredHeight());
                                            }

                                            @Override // X.AbstractC48182Ef, X.AbstractC48202Eh, android.view.View
                                            public void onMeasure(int i2, int i3) {
                                                super.onMeasure(i2, i3);
                                                int measuredHeight = getMeasuredHeight();
                                                setMeasuredDimension(getMeasuredWidth(), this.A00.A01(((AbstractC48202Eh) this).A0C.getMeasuredWidth()) + measuredHeight);
                                            }
                                        };
                                    }
                                    return new C2WC(context, c09e);
                                case 10:
                                    return new AbstractC51512Ws(context, (C04280Jo) anonymousClass092) { // from class: X.2Wr
                                        public final TextView A00;

                                        {
                                            super(context, r6);
                                            setClickable(false);
                                            TextView textView = (TextView) findViewById(R.id.info);
                                            this.A00 = textView;
                                            textView.setBackgroundResource(R.drawable.date_balloon);
                                            this.A00.setCompoundDrawablePadding(context.getResources().getDimensionPixelSize(R.dimen.conversation_row_padding));
                                            this.A00.setTextSize(AbstractC48182Ef.A03(getResources()));
                                            this.A00.setOnLongClickListener(this.A19);
                                            setLongClickable(true);
                                            setWillNotDraw(false);
                                            A0j();
                                        }

                                        @Override // X.AbstractC48182Ef
                                        public void A0I() {
                                            A0j();
                                            A0e(false);
                                        }

                                        @Override // X.AbstractC48182Ef
                                        public void A0X(AnonymousClass092 anonymousClass0922, boolean z) {
                                            boolean z2 = anonymousClass0922 != super.getFMessage();
                                            super.A0X(anonymousClass0922, z);
                                            if (z || z2) {
                                                A0j();
                                            }
                                        }

                                        public final void A0j() {
                                            int i2;
                                            C04280Jo c04280Jo = (C04280Jo) super.getFMessage();
                                            int A1B = c04280Jo.A1B();
                                            if (A1B == 0) {
                                                i2 = R.string.voice_missed_call_at;
                                            } else if (A1B == 1) {
                                                i2 = R.string.video_missed_call_at;
                                            } else if (A1B == 2) {
                                                i2 = R.string.voice_missed_group_call_at;
                                            } else if (A1B != 3) {
                                                StringBuilder A0P = C000200d.A0P("unknown call type ");
                                                A0P.append(c04280Jo.A1B());
                                                C000700j.A08(false, A0P.toString());
                                                i2 = R.string.voice_missed_call_at;
                                            } else {
                                                i2 = R.string.video_missed_group_call_at;
                                            }
                                            long A06 = ((AbstractC48182Ef) this).A0X.A06(c04280Jo.A0E);
                                            TextView textView = this.A00;
                                            textView.setText(AbstractC40621sZ.A01(((AbstractC48202Eh) this).A0J, getContext().getString(i2, AbstractC40621sZ.A00(((AbstractC48202Eh) this).A0J, A06)), A06));
                                            textView.setOnClickListener(new ViewOnClickEBaseShape0S0200000_I0_0(this, c04280Jo, 11));
                                            C002301c c002301c = ((AbstractC48202Eh) this).A0J;
                                            Context context2 = getContext();
                                            boolean A1C = c04280Jo.A1C();
                                            int i3 = R.drawable.ic_missed_voice_call;
                                            if (A1C) {
                                                i3 = R.drawable.msg_status_missed_video_call;
                                            }
                                            Drawable A0O = C02180Ae.A0O(context2, i3, R.color.msgStatusErrorTint);
                                            if (c002301c.A0N()) {
                                                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new C0We(c002301c, A0O), (Drawable) null);
                                            } else {
                                                textView.setCompoundDrawablesWithIntrinsicBounds(A0O, (Drawable) null, (Drawable) null, (Drawable) null);
                                            }
                                        }

                                        @Override // X.AbstractC48202Eh
                                        public int getCenteredLayoutId() {
                                            return R.layout.conversation_row_divider;
                                        }

                                        @Override // X.AbstractC48202Eh
                                        public /* bridge */ /* synthetic */ AnonymousClass092 getFMessage() {
                                            return super.getFMessage();
                                        }

                                        @Override // X.AbstractC48202Eh
                                        public C04280Jo getFMessage() {
                                            return (C04280Jo) super.getFMessage();
                                        }

                                        @Override // X.AbstractC48202Eh
                                        public int getIncomingLayoutId() {
                                            return R.layout.conversation_row_divider;
                                        }

                                        @Override // X.AbstractC48202Eh
                                        public int getOutgoingLayoutId() {
                                            return R.layout.conversation_row_divider;
                                        }

                                        @Override // X.AbstractC48202Eh
                                        public void setFMessage(AnonymousClass092 anonymousClass0922) {
                                            C000700j.A07(anonymousClass0922 instanceof C04280Jo);
                                            super.setFMessage(anonymousClass0922);
                                        }
                                    };
                                case GoogleMigrateImporterActivity.A0E /* 11 */:
                                    if (anonymousClass092.A0F != null) {
                                        return new C51532Wv(context, anonymousClass092);
                                    }
                                    return new AbstractC48182Ef(context, (C1MK) anonymousClass092) { // from class: X.3Lr
                                        @Override // X.AbstractC48202Eh
                                        public int getBubbleAlpha() {
                                            return 153;
                                        }

                                        {
                                            TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.message_text);
                                            textEmojiLabel.A07 = new C02770Cu();
                                            textEmojiLabel.setAutoLinkMask(0);
                                            textEmojiLabel.setLinksClickable(false);
                                            textEmojiLabel.setFocusable(false);
                                            textEmojiLabel.setClickable(false);
                                            textEmojiLabel.setLongClickable(false);
                                            Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(Html.fromHtml(getContext().getString(R.string.decryption_placeholder_message_text, this.A10.A03("general", "26000015", null).toString())));
                                            A0R(newSpannable);
                                            textEmojiLabel.setAccessibilityHelper(new C02780Cv(((AbstractC48182Ef) this).A0W, textEmojiLabel));
                                            textEmojiLabel.setText(newSpannable);
                                            C000200d.A0g(this.A0Y, "decryption_failure_views", this.A0Y.A00.getInt("decryption_failure_views", 0) + 1);
                                            this.A0n.A07(r9, 2);
                                        }

                                        @Override // X.AbstractC48202Eh
                                        public int getCenteredLayoutId() {
                                            return R.layout.conversation_row_decryption_failure_left;
                                        }

                                        @Override // X.AbstractC48202Eh
                                        public int getIncomingLayoutId() {
                                            return R.layout.conversation_row_decryption_failure_left;
                                        }

                                        @Override // X.AbstractC48202Eh
                                        public int getOutgoingLayoutId() {
                                            return R.layout.conversation_row_decryption_failure_right;
                                        }
                                    };
                                case 12:
                                    AnonymousClass093 anonymousClass093 = anonymousClass092.A0F;
                                    if (anonymousClass093 != null && anonymousClass093.A02 != 5) {
                                        return new C51532Wv(context, anonymousClass092);
                                    }
                                    return new C2WN(context, anonymousClass092);
                                case 13:
                                    C2JC c2jc = new C2JC(context, (C0LO) anonymousClass092);
                                    List list = this.A03;
                                    if (list == null) {
                                        list = new ArrayList();
                                        this.A03 = list;
                                    }
                                    list.add(c2jc);
                                    return c2jc;
                                case 14:
                                    return new C2W8(context, anonymousClass092, A01(context), A03());
                                case 15:
                                    return new C2X6(context, (C03890Hn) anonymousClass092) { // from class: X.2X5
                                        public final TextEmojiLabel A00;
                                        public final CharSequence A01;

                                        {
                                            super(context, r7);
                                            TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.message_text);
                                            this.A00 = textEmojiLabel;
                                            textEmojiLabel.setCompoundDrawablesWithIntrinsicBounds(((AbstractC48202Eh) this).A0J.A0N() ? 0 : R.drawable.message_got_receipt_revoked, 0, ((AbstractC48202Eh) this).A0J.A0N() ? R.drawable.message_got_receipt_revoked : 0, 0);
                                            String string = context.getString(r7.A0n.A02 ? R.string.revoked_msg_outgoing : R.string.revoked_msg_incoming);
                                            StringBuilder sb = new StringBuilder();
                                            String str = C02M.A01;
                                            sb.append(str);
                                            sb.append(string);
                                            sb.append(str);
                                            String obj = sb.toString();
                                            this.A01 = obj;
                                            TextEmojiLabel textEmojiLabel2 = this.A00;
                                            textEmojiLabel2.setText(obj);
                                            C000200d.A0b(textEmojiLabel2);
                                            textEmojiLabel2.setAutoLinkMask(0);
                                            textEmojiLabel2.setLinksClickable(false);
                                            textEmojiLabel2.setFocusable(false);
                                            textEmojiLabel2.setClickable(false);
                                            textEmojiLabel2.setLongClickable(false);
                                        }

                                        @Override // X.AbstractC48182Ef
                                        public int A0C(int i2) {
                                            if (getFMessage().A0n.A02) {
                                                return R.drawable.message_unsent;
                                            }
                                            return 0;
                                        }

                                        @Override // X.AbstractC48182Ef
                                        public int A0D(int i2) {
                                            if (getFMessage().A0n.A02) {
                                                return R.color.msgStatusTint;
                                            }
                                            return 0;
                                        }

                                        @Override // X.AbstractC48182Ef
                                        public void A0X(AnonymousClass092 anonymousClass0922, boolean z) {
                                            boolean z2 = anonymousClass0922 != getFMessage();
                                            super.A0X(anonymousClass0922, z);
                                            if (z || z2) {
                                                TextEmojiLabel textEmojiLabel = this.A00;
                                                textEmojiLabel.setText(this.A01);
                                                C000200d.A0b(textEmojiLabel);
                                                textEmojiLabel.setAutoLinkMask(0);
                                                textEmojiLabel.setLinksClickable(false);
                                                textEmojiLabel.setFocusable(false);
                                                textEmojiLabel.setClickable(false);
                                                textEmojiLabel.setLongClickable(false);
                                            }
                                        }

                                        @Override // X.AbstractC48202Eh
                                        public int getCenteredLayoutId() {
                                            return R.layout.conversation_row_revoked_left;
                                        }

                                        @Override // X.AbstractC48202Eh
                                        public int getIncomingLayoutId() {
                                            return R.layout.conversation_row_revoked_left;
                                        }

                                        @Override // X.AbstractC48202Eh
                                        public int getOutgoingLayoutId() {
                                            return R.layout.conversation_row_revoked_right;
                                        }
                                    };
                                case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                                    return new C51422Wj(context, (C0KC) anonymousClass092, A01(context));
                                default:
                                    switch (b) {
                                        case 19:
                                            return new C2WT(context, (C10020fA) anonymousClass092);
                                        case C0M6.A01 /* 20 */:
                                            return new C2X7(context, (C04040Ie) anonymousClass092, this.A01);
                                        case 21:
                                        case 22:
                                            return new C51572Wz(context, anonymousClass092);
                                        case 23:
                                            return new C2X3(context, (C04160Iu) anonymousClass092);
                                        case 24:
                                            return new C2WR(context, (C04570Ky) anonymousClass092);
                                        case 25:
                                            return new AbstractC51372We(context, (C14390ms) anonymousClass092) { // from class: X.2Wd
                                                public final TemplateRowContentLayout A01 = (TemplateRowContentLayout) findViewById(R.id.template_message_content);
                                                public final TemplateQuickReplyButtonsLayout A00 = (TemplateQuickReplyButtonsLayout) findViewById(R.id.template_quick_reply_buttons);

                                                {
                                                    ((C2WX) this).A08.setTemplateImageRatio(true);
                                                    A0n();
                                                }

                                                @Override // X.C2WX, X.AbstractC48182Ef
                                                public void A0I() {
                                                    A0n();
                                                    super.A0I();
                                                }

                                                @Override // X.C2WX, X.AbstractC48182Ef
                                                public void A0X(AnonymousClass092 anonymousClass0922, boolean z) {
                                                    boolean z2 = anonymousClass0922 != getFMessage();
                                                    super.A0X(anonymousClass0922, z);
                                                    if (z || z2) {
                                                        A0n();
                                                    }
                                                }

                                                public final void A0n() {
                                                    List list2;
                                                    this.A01.A00(this);
                                                    TemplateQuickReplyButtonsLayout templateQuickReplyButtonsLayout = this.A00;
                                                    if (templateQuickReplyButtonsLayout != null) {
                                                        C656037v c656037v = this.A1G;
                                                        if (C02180Ae.A0F(getContext()) instanceof Conversation) {
                                                            list2 = ((InterfaceC03910Hq) getFMessage()).ADS().A02;
                                                        } else {
                                                            list2 = null;
                                                        }
                                                        templateQuickReplyButtonsLayout.A01(c656037v, list2);
                                                    }
                                                }

                                                @Override // X.C2WX, X.AbstractC48202Eh
                                                public int getCenteredLayoutId() {
                                                    return R.layout.conversation_row_template_title_image_left;
                                                }

                                                @Override // X.C2WX, X.AbstractC48202Eh
                                                public int getIncomingLayoutId() {
                                                    return R.layout.conversation_row_template_title_image_left;
                                                }

                                                @Override // X.C2WX, X.AbstractC48202Eh
                                                public int getOutgoingLayoutId() {
                                                    return R.layout.conversation_row_template_title_image_right;
                                                }

                                                @Override // X.AbstractC48182Ef, X.AbstractC48202Eh, android.view.ViewGroup, android.view.View
                                                public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                                                    super.onLayout(z, i2, i3, i4, i5);
                                                    TemplateQuickReplyButtonsLayout templateQuickReplyButtonsLayout = this.A00;
                                                    if (templateQuickReplyButtonsLayout != null) {
                                                        templateQuickReplyButtonsLayout.layout(((AbstractC48202Eh) this).A0C.getLeft(), ((AbstractC48202Eh) this).A0C.getBottom(), ((AbstractC48202Eh) this).A0C.getRight(), ((AbstractC48202Eh) this).A0C.getBottom() + templateQuickReplyButtonsLayout.getMeasuredHeight());
                                                    }
                                                }

                                                @Override // X.AbstractC48182Ef, X.AbstractC48202Eh, android.view.View
                                                public void onMeasure(int i2, int i3) {
                                                    super.onMeasure(i2, i3);
                                                    TemplateQuickReplyButtonsLayout templateQuickReplyButtonsLayout = this.A00;
                                                    if (templateQuickReplyButtonsLayout != null) {
                                                        int measuredHeight = getMeasuredHeight();
                                                        setMeasuredDimension(getMeasuredWidth(), templateQuickReplyButtonsLayout.A00(((AbstractC48202Eh) this).A0C.getMeasuredWidth()) + measuredHeight);
                                                    }
                                                }
                                            };
                                        case 26:
                                            return new C2WI(context, (C21700zl) anonymousClass092) { // from class: X.2WH
                                                public final TemplateRowContentLayout A01 = (TemplateRowContentLayout) findViewById(R.id.template_message_content);
                                                public final TemplateQuickReplyButtonsLayout A00 = (TemplateQuickReplyButtonsLayout) findViewById(R.id.template_quick_reply_buttons);

                                                {
                                                    A0o();
                                                }

                                                @Override // X.C2WC, X.AbstractC48182Ef
                                                public void A0I() {
                                                    A0o();
                                                    super.A0I();
                                                }

                                                @Override // X.C2WC, X.AbstractC48182Ef
                                                public void A0X(AnonymousClass092 anonymousClass0922, boolean z) {
                                                    boolean z2 = anonymousClass0922 != getFMessage();
                                                    super.A0X(anonymousClass0922, z);
                                                    if (z || z2) {
                                                        A0o();
                                                    }
                                                }

                                                public final void A0o() {
                                                    List list2;
                                                    this.A01.A00(this);
                                                    TemplateQuickReplyButtonsLayout templateQuickReplyButtonsLayout = this.A00;
                                                    if (templateQuickReplyButtonsLayout != null) {
                                                        C656037v c656037v = this.A1G;
                                                        if (C02180Ae.A0F(getContext()) instanceof Conversation) {
                                                            list2 = ((InterfaceC03910Hq) getFMessage()).ADS().A02;
                                                        } else {
                                                            list2 = null;
                                                        }
                                                        templateQuickReplyButtonsLayout.A01(c656037v, list2);
                                                    }
                                                }

                                                @Override // X.C2WC, X.AbstractC48202Eh
                                                public int getCenteredLayoutId() {
                                                    return R.layout.conversation_row_template_title_document_left;
                                                }

                                                @Override // X.C2WC, X.AbstractC48202Eh
                                                public int getIncomingLayoutId() {
                                                    return R.layout.conversation_row_template_title_document_left;
                                                }

                                                @Override // X.C2WC, X.AbstractC48202Eh
                                                public int getOutgoingLayoutId() {
                                                    return R.layout.conversation_row_template_title_document_right;
                                                }

                                                @Override // X.AbstractC48182Ef, X.AbstractC48202Eh, android.view.ViewGroup, android.view.View
                                                public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                                                    super.onLayout(z, i2, i3, i4, i5);
                                                    TemplateQuickReplyButtonsLayout templateQuickReplyButtonsLayout = this.A00;
                                                    if (templateQuickReplyButtonsLayout != null) {
                                                        templateQuickReplyButtonsLayout.layout(((AbstractC48202Eh) this).A0C.getLeft(), ((AbstractC48202Eh) this).A0C.getBottom(), ((AbstractC48202Eh) this).A0C.getRight(), ((AbstractC48202Eh) this).A0C.getBottom() + templateQuickReplyButtonsLayout.getMeasuredHeight());
                                                    }
                                                }

                                                @Override // X.AbstractC48182Ef, X.AbstractC48202Eh, android.view.View
                                                public void onMeasure(int i2, int i3) {
                                                    super.onMeasure(i2, i3);
                                                    TemplateQuickReplyButtonsLayout templateQuickReplyButtonsLayout = this.A00;
                                                    if (templateQuickReplyButtonsLayout != null) {
                                                        int measuredHeight = getMeasuredHeight();
                                                        setMeasuredDimension(getMeasuredWidth(), templateQuickReplyButtonsLayout.A00(((AbstractC48202Eh) this).A0C.getMeasuredWidth()) + measuredHeight);
                                                    }
                                                }
                                            };
                                        case 27:
                                            return new C2XH(context, (C1MI) anonymousClass092) { // from class: X.2XG
                                                public final TextEmojiLabel A00 = (TextEmojiLabel) findViewById(R.id.title_text_message);
                                                public final TemplateRowContentLayout A02 = (TemplateRowContentLayout) findViewById(R.id.template_message_content);
                                                public final TemplateQuickReplyButtonsLayout A01 = (TemplateQuickReplyButtonsLayout) findViewById(R.id.template_quick_reply_buttons);

                                                {
                                                    A0j();
                                                }

                                                @Override // X.AbstractC48182Ef
                                                public void A0I() {
                                                    A0j();
                                                    A0e(false);
                                                }

                                                @Override // X.AbstractC48182Ef
                                                public void A0X(AnonymousClass092 anonymousClass0922, boolean z) {
                                                    boolean z2 = anonymousClass0922 != getFMessage();
                                                    super.A0X(anonymousClass0922, z);
                                                    if (z || z2) {
                                                        A0j();
                                                    }
                                                }

                                                /* JADX WARN: Code restructure failed: missing block: B:41:0x0012, code lost:
                                                    if (r0.isEmpty() != false) goto L35;
                                                 */
                                                /*
                                                    Code decompiled incorrectly, please refer to instructions dump.
                                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                                */
                                                public final void A0j() {
                                                    /*
                                                        r10 = this;
                                                        X.092 r6 = r10.getFMessage()
                                                        X.1MI r6 = (X.C1MI) r6
                                                        X.0PY r0 = r6.A00
                                                        java.util.List r0 = r0.A02
                                                        r7 = 0
                                                        if (r0 == 0) goto L14
                                                        boolean r0 = r0.isEmpty()
                                                        r9 = 1
                                                        if (r0 == 0) goto L15
                                                    L14:
                                                        r9 = 0
                                                    L15:
                                                        r8 = -2
                                                        if (r9 == 0) goto La3
                                                        android.content.res.Resources r1 = r10.getResources()
                                                        r0 = 2131165502(0x7f07013e, float:1.7945223E38)
                                                        int r5 = r1.getDimensionPixelSize(r0)
                                                    L23:
                                                        android.view.View r0 = r10.A0C
                                                        android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
                                                        r1.width = r5
                                                        android.view.View r0 = r10.A0C
                                                        r0.setLayoutParams(r1)
                                                        com.whatsapp.conversation.conversationrow.TemplateRowContentLayout r4 = r10.A02
                                                        r4.A00(r10)
                                                        java.lang.String r0 = r6.A0G()
                                                        boolean r0 = android.text.TextUtils.isEmpty(r0)
                                                        if (r0 != 0) goto L9b
                                                        java.lang.String r1 = r6.A0G()
                                                        com.whatsapp.TextEmojiLabel r3 = r10.A00
                                                        X.092 r0 = r10.getFMessage()
                                                        r10.A0a(r1, r3, r0, r7)
                                                        android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
                                                        if (r9 == 0) goto L92
                                                        r1 = r5
                                                    L53:
                                                        r2.width = r1
                                                        r3.setLayoutParams(r2)
                                                        r3.setVisibility(r7)
                                                    L5b:
                                                        android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
                                                        if (r9 != 0) goto L69
                                                        boolean r0 = r10.A0k(r6)
                                                        if (r0 == 0) goto L68
                                                        r8 = -1
                                                    L68:
                                                        r5 = r8
                                                    L69:
                                                        r1.width = r5
                                                        r4.setLayoutParams(r1)
                                                        com.whatsapp.conversation.conversationrow.TemplateQuickReplyButtonsLayout r2 = r10.A01
                                                        if (r2 == 0) goto L8f
                                                        X.37v r1 = r10.A1G
                                                        android.content.Context r0 = r10.getContext()
                                                        android.app.Activity r0 = X.C02180Ae.A0F(r0)
                                                        boolean r0 = r0 instanceof com.whatsapp.Conversation
                                                        if (r0 == 0) goto L90
                                                        X.092 r0 = r10.getFMessage()
                                                        X.0Hq r0 = (X.InterfaceC03910Hq) r0
                                                        X.0PY r0 = r0.ADS()
                                                        java.util.List r0 = r0.A02
                                                    L8c:
                                                        r2.A01(r1, r0)
                                                    L8f:
                                                        return
                                                    L90:
                                                        r0 = 0
                                                        goto L8c
                                                    L92:
                                                        boolean r0 = r10.A0k(r6)
                                                        r1 = -1
                                                        if (r0 == 0) goto L53
                                                        r1 = -2
                                                        goto L53
                                                    L9b:
                                                        com.whatsapp.TextEmojiLabel r1 = r10.A00
                                                        r0 = 8
                                                        r1.setVisibility(r0)
                                                        goto L5b
                                                    La3:
                                                        r5 = -2
                                                        goto L23
                                                    */
                                                    throw new UnsupportedOperationException("Method not decompiled: X.C2XG.A0j():void");
                                                }

                                                public final boolean A0k(C1MI c1mi) {
                                                    String A0G = c1mi.A0G();
                                                    if (TextUtils.isEmpty(A0G)) {
                                                        return false;
                                                    }
                                                    C0PY c0py = c1mi.A00;
                                                    String str = c0py.A00;
                                                    String str2 = c0py.A01;
                                                    float measureText = this.A00.getPaint().measureText(A0G);
                                                    TemplateRowContentLayout templateRowContentLayout = this.A02;
                                                    return measureText > templateRowContentLayout.getContentTextView().getPaint().measureText(str) && measureText > (!TextUtils.isEmpty(str2) ? templateRowContentLayout.A02.getPaint().measureText(str2) : 0.0f);
                                                }

                                                @Override // X.AbstractC48202Eh
                                                public int getCenteredLayoutId() {
                                                    return R.layout.conversation_row_template_title_text_left;
                                                }

                                                @Override // X.AbstractC48202Eh
                                                public int getIncomingLayoutId() {
                                                    return R.layout.conversation_row_template_title_text_left;
                                                }

                                                @Override // X.AbstractC48202Eh
                                                public int getOutgoingLayoutId() {
                                                    return R.layout.conversation_row_template_title_text_right;
                                                }

                                                @Override // X.AbstractC48182Ef, X.AbstractC48202Eh, android.view.ViewGroup, android.view.View
                                                public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                                                    super.onLayout(z, i2, i3, i4, i5);
                                                    TemplateQuickReplyButtonsLayout templateQuickReplyButtonsLayout = this.A01;
                                                    if (templateQuickReplyButtonsLayout != null) {
                                                        templateQuickReplyButtonsLayout.layout(((AbstractC48202Eh) this).A0C.getLeft(), ((AbstractC48202Eh) this).A0C.getBottom(), ((AbstractC48202Eh) this).A0C.getRight(), ((AbstractC48202Eh) this).A0C.getBottom() + templateQuickReplyButtonsLayout.getMeasuredHeight());
                                                    }
                                                }

                                                @Override // X.AbstractC48182Ef, X.AbstractC48202Eh, android.view.View
                                                public void onMeasure(int i2, int i3) {
                                                    super.onMeasure(i2, i3);
                                                    TemplateQuickReplyButtonsLayout templateQuickReplyButtonsLayout = this.A01;
                                                    if (templateQuickReplyButtonsLayout != null) {
                                                        int measuredHeight = getMeasuredHeight();
                                                        setMeasuredDimension(getMeasuredWidth(), templateQuickReplyButtonsLayout.A00(((AbstractC48202Eh) this).A0C.getMeasuredWidth()) + measuredHeight);
                                                    }
                                                }
                                            };
                                        case 28:
                                            return new C2XN(context, (C10470g6) anonymousClass092) { // from class: X.2XM
                                                public final TemplateRowContentLayout A01 = (TemplateRowContentLayout) findViewById(R.id.template_message_content);
                                                public final TemplateQuickReplyButtonsLayout A00 = (TemplateQuickReplyButtonsLayout) findViewById(R.id.template_quick_reply_buttons);

                                                {
                                                    A0o();
                                                }

                                                @Override // X.C2XI, X.AbstractC48182Ef
                                                public void A0I() {
                                                    A0o();
                                                    super.A0I();
                                                }

                                                @Override // X.C2XI, X.AbstractC48182Ef
                                                public void A0X(AnonymousClass092 anonymousClass0922, boolean z) {
                                                    boolean z2 = anonymousClass0922 != getFMessage();
                                                    super.A0X(anonymousClass0922, z);
                                                    if (z || z2) {
                                                        A0o();
                                                    }
                                                }

                                                public final void A0o() {
                                                    List list2;
                                                    this.A01.A00(this);
                                                    TemplateQuickReplyButtonsLayout templateQuickReplyButtonsLayout = this.A00;
                                                    if (templateQuickReplyButtonsLayout != null) {
                                                        C656037v c656037v = this.A1G;
                                                        if (C02180Ae.A0F(getContext()) instanceof Conversation) {
                                                            list2 = ((InterfaceC03910Hq) getFMessage()).ADS().A02;
                                                        } else {
                                                            list2 = null;
                                                        }
                                                        templateQuickReplyButtonsLayout.A01(c656037v, list2);
                                                    }
                                                }

                                                @Override // X.C2XI, X.AbstractC48202Eh
                                                public int getCenteredLayoutId() {
                                                    return R.layout.conversation_row_template_title_video_left;
                                                }

                                                @Override // X.C2XI, X.AbstractC48202Eh
                                                public int getIncomingLayoutId() {
                                                    return R.layout.conversation_row_template_title_video_left;
                                                }

                                                @Override // X.C2XI, X.AbstractC48202Eh
                                                public int getOutgoingLayoutId() {
                                                    return R.layout.conversation_row_template_title_video_right;
                                                }

                                                @Override // X.AbstractC48182Ef, X.AbstractC48202Eh, android.view.ViewGroup, android.view.View
                                                public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                                                    super.onLayout(z, i2, i3, i4, i5);
                                                    TemplateQuickReplyButtonsLayout templateQuickReplyButtonsLayout = this.A00;
                                                    if (templateQuickReplyButtonsLayout != null) {
                                                        templateQuickReplyButtonsLayout.layout(((AbstractC48202Eh) this).A0C.getLeft(), ((AbstractC48202Eh) this).A0C.getBottom(), ((AbstractC48202Eh) this).A0C.getRight(), ((AbstractC48202Eh) this).A0C.getBottom() + templateQuickReplyButtonsLayout.getMeasuredHeight());
                                                    }
                                                }

                                                @Override // X.AbstractC48182Ef, X.AbstractC48202Eh, android.view.View
                                                public void onMeasure(int i2, int i3) {
                                                    super.onMeasure(i2, i3);
                                                    TemplateQuickReplyButtonsLayout templateQuickReplyButtonsLayout = this.A00;
                                                    if (templateQuickReplyButtonsLayout != null) {
                                                        int measuredHeight = getMeasuredHeight();
                                                        setMeasuredDimension(getMeasuredWidth(), templateQuickReplyButtonsLayout.A00(((AbstractC48202Eh) this).A0C.getMeasuredWidth()) + measuredHeight);
                                                    }
                                                }
                                            };
                                        case 29:
                                            return new C2WQ(context, (C10480g7) anonymousClass092) { // from class: X.2WP
                                                public final TemplateRowContentLayout A01 = (TemplateRowContentLayout) findViewById(R.id.template_message_content);
                                                public final TemplateQuickReplyButtonsLayout A00 = (TemplateQuickReplyButtonsLayout) findViewById(R.id.template_quick_reply_buttons);

                                                {
                                                    A0s();
                                                }

                                                @Override // X.C2JC, X.AbstractC48182Ef
                                                public void A0I() {
                                                    A0s();
                                                    super.A0I();
                                                }

                                                @Override // X.C2JC, X.AbstractC48182Ef
                                                public void A0X(AnonymousClass092 anonymousClass0922, boolean z) {
                                                    boolean z2 = anonymousClass0922 != getFMessage();
                                                    super.A0X(anonymousClass0922, z);
                                                    if (z || z2) {
                                                        A0s();
                                                    }
                                                }

                                                public final void A0s() {
                                                    List list2;
                                                    this.A01.A00(this);
                                                    TemplateQuickReplyButtonsLayout templateQuickReplyButtonsLayout = this.A00;
                                                    if (templateQuickReplyButtonsLayout != null) {
                                                        C656037v c656037v = this.A1G;
                                                        if (C02180Ae.A0F(getContext()) instanceof Conversation) {
                                                            list2 = ((InterfaceC03910Hq) getFMessage()).ADS().A02;
                                                        } else {
                                                            list2 = null;
                                                        }
                                                        templateQuickReplyButtonsLayout.A01(c656037v, list2);
                                                    }
                                                }

                                                @Override // X.C2JC, X.AbstractC48202Eh
                                                public int getCenteredLayoutId() {
                                                    return R.layout.conversation_row_template_title_gif_left;
                                                }

                                                @Override // X.C2JC, X.AbstractC48202Eh
                                                public int getIncomingLayoutId() {
                                                    return R.layout.conversation_row_template_title_gif_left;
                                                }

                                                @Override // X.C2JC, X.AbstractC48202Eh
                                                public int getOutgoingLayoutId() {
                                                    return R.layout.conversation_row_template_title_gif_right;
                                                }

                                                @Override // X.AbstractC48182Ef, X.AbstractC48202Eh, android.view.ViewGroup, android.view.View
                                                public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                                                    super.onLayout(z, i2, i3, i4, i5);
                                                    TemplateQuickReplyButtonsLayout templateQuickReplyButtonsLayout = this.A00;
                                                    if (templateQuickReplyButtonsLayout != null) {
                                                        templateQuickReplyButtonsLayout.layout(((AbstractC48202Eh) this).A0C.getLeft(), ((AbstractC48202Eh) this).A0C.getBottom(), ((AbstractC48202Eh) this).A0C.getRight(), ((AbstractC48202Eh) this).A0C.getBottom() + templateQuickReplyButtonsLayout.getMeasuredHeight());
                                                    }
                                                }

                                                @Override // X.AbstractC48182Ef, X.AbstractC48202Eh, android.view.View
                                                public void onMeasure(int i2, int i3) {
                                                    super.onMeasure(i2, i3);
                                                    TemplateQuickReplyButtonsLayout templateQuickReplyButtonsLayout = this.A00;
                                                    if (templateQuickReplyButtonsLayout != null) {
                                                        int measuredHeight = getMeasuredHeight();
                                                        setMeasuredDimension(getMeasuredWidth(), templateQuickReplyButtonsLayout.A00(((AbstractC48202Eh) this).A0C.getMeasuredWidth()) + measuredHeight);
                                                    }
                                                }
                                            };
                                        case 30:
                                            return new AbstractC51492Wq(context, (C21170yu) anonymousClass092) { // from class: X.2Wp
                                                public final TemplateRowContentLayout A01 = (TemplateRowContentLayout) findViewById(R.id.template_message_content);
                                                public final TemplateQuickReplyButtonsLayout A00 = (TemplateQuickReplyButtonsLayout) findViewById(R.id.template_quick_reply_buttons);

                                                {
                                                    A0k();
                                                }

                                                @Override // X.C51442Wl, X.AbstractC48182Ef
                                                public void A0I() {
                                                    A0k();
                                                    super.A0I();
                                                }

                                                @Override // X.C51442Wl, X.AbstractC48182Ef
                                                public void A0X(AnonymousClass092 anonymousClass0922, boolean z) {
                                                    boolean z2 = anonymousClass0922 != getFMessage();
                                                    super.A0X(anonymousClass0922, z);
                                                    if (z || z2) {
                                                        A0k();
                                                    }
                                                }

                                                public final void A0k() {
                                                    List list2;
                                                    this.A01.A00(this);
                                                    TemplateQuickReplyButtonsLayout templateQuickReplyButtonsLayout = this.A00;
                                                    if (templateQuickReplyButtonsLayout != null) {
                                                        C656037v c656037v = this.A1G;
                                                        if (C02180Ae.A0F(getContext()) instanceof Conversation) {
                                                            list2 = ((InterfaceC03910Hq) getFMessage()).ADS().A02;
                                                        } else {
                                                            list2 = null;
                                                        }
                                                        templateQuickReplyButtonsLayout.A01(c656037v, list2);
                                                    }
                                                }

                                                @Override // X.C51442Wl, X.AbstractC48202Eh
                                                public int getCenteredLayoutId() {
                                                    return R.layout.conversation_row_template_title_location_left;
                                                }

                                                @Override // X.C51442Wl, X.AbstractC48202Eh
                                                public int getIncomingLayoutId() {
                                                    return R.layout.conversation_row_template_title_location_left;
                                                }

                                                @Override // X.C51442Wl, X.AbstractC48202Eh
                                                public int getOutgoingLayoutId() {
                                                    return R.layout.conversation_row_template_title_location_right;
                                                }

                                                @Override // X.AbstractC48182Ef, X.AbstractC48202Eh, android.view.ViewGroup, android.view.View
                                                public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                                                    super.onLayout(z, i2, i3, i4, i5);
                                                    TemplateQuickReplyButtonsLayout templateQuickReplyButtonsLayout = this.A00;
                                                    if (templateQuickReplyButtonsLayout != null) {
                                                        templateQuickReplyButtonsLayout.layout(((AbstractC48202Eh) this).A0C.getLeft(), ((AbstractC48202Eh) this).A0C.getBottom(), ((AbstractC48202Eh) this).A0C.getRight(), ((AbstractC48202Eh) this).A0C.getBottom() + templateQuickReplyButtonsLayout.getMeasuredHeight());
                                                    }
                                                }

                                                @Override // X.AbstractC48182Ef, X.AbstractC48202Eh, android.view.View
                                                public void onMeasure(int i2, int i3) {
                                                    super.onMeasure(i2, i3);
                                                    TemplateQuickReplyButtonsLayout templateQuickReplyButtonsLayout = this.A00;
                                                    if (templateQuickReplyButtonsLayout != null) {
                                                        int measuredHeight = getMeasuredHeight();
                                                        setMeasuredDimension(getMeasuredWidth(), templateQuickReplyButtonsLayout.A00(((AbstractC48202Eh) this).A0C.getMeasuredWidth()) + measuredHeight);
                                                    }
                                                }
                                            };
                                        case 31:
                                            if (anonymousClass092.A0F != null) {
                                                return new C51532Wv(context, anonymousClass092);
                                            }
                                            return new AbstractC48182Ef(context, (C1MJ) anonymousClass092) { // from class: X.3Ls
                                                @Override // X.AbstractC48202Eh
                                                public int getBubbleAlpha() {
                                                    return 153;
                                                }

                                                {
                                                    TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.message_text);
                                                    textEmojiLabel.A07 = new C02770Cu();
                                                    textEmojiLabel.setAutoLinkMask(0);
                                                    textEmojiLabel.setLinksClickable(false);
                                                    textEmojiLabel.setFocusable(false);
                                                    textEmojiLabel.setClickable(false);
                                                    textEmojiLabel.setLongClickable(false);
                                                    Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(Html.fromHtml(getContext().getString(R.string.decryption_placeholder_message_text, this.A10.A03("general", "26000255", null).toString())));
                                                    A0R(newSpannable);
                                                    textEmojiLabel.setAccessibilityHelper(new C02780Cv(((AbstractC48182Ef) this).A0W, textEmojiLabel));
                                                    textEmojiLabel.setText(newSpannable);
                                                    this.A0n.A07(r8, 2);
                                                }

                                                @Override // X.AbstractC48202Eh
                                                public int getCenteredLayoutId() {
                                                    return R.layout.conversation_row_decryption_failure_left;
                                                }

                                                @Override // X.AbstractC48202Eh
                                                public int getIncomingLayoutId() {
                                                    return R.layout.conversation_row_decryption_failure_left;
                                                }

                                                @Override // X.AbstractC48202Eh
                                                public int getOutgoingLayoutId() {
                                                    return R.layout.conversation_row_decryption_failure_right;
                                                }
                                            };
                                        case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /* 32 */:
                                            break;
                                        default:
                                            switch (b) {
                                                case 42:
                                                    if (this.A04.A0E(C01C.A2U)) {
                                                        AnonymousClass097 anonymousClass097 = (AnonymousClass097) anonymousClass092;
                                                        if (anonymousClass097.A0n.A02) {
                                                            return new C2JG(context, anonymousClass097);
                                                        }
                                                        return new C2XO(context, anonymousClass097);
                                                    }
                                                    return new C2WN(context, anonymousClass092);
                                                case 43:
                                                    if (this.A04.A0E(C01C.A2U)) {
                                                        AnonymousClass097 anonymousClass0972 = (AnonymousClass097) anonymousClass092;
                                                        if (anonymousClass0972.A0n.A02) {
                                                            return new C2JG(context, anonymousClass0972);
                                                        }
                                                        return new C2XO(context, anonymousClass0972);
                                                    }
                                                    return new C2WN(context, anonymousClass092);
                                                case 44:
                                                    return new C2Ed(context, (C0LN) anonymousClass092);
                                                case 45:
                                                    break;
                                                case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /* 46 */:
                                                    break;
                                                default:
                                                    if (anonymousClass092.A08 == -1 && b == -1) {
                                                        return new C2WA(context, (C04300Jq) anonymousClass092);
                                                    }
                                                    return new C2WN(context, anonymousClass092);
                                            }
                                    }
                            }
                        }
                        return new C51522Wt(context, (C0LU) anonymousClass092);
                    }
                    return new C2WN(context, anonymousClass092);
                }
                return new C2XC(context, (C0JJ) anonymousClass092);
            } else {
                return new C2WL(context, (C0KU) anonymousClass092);
            }
        } else {
            return new C2W6(context, anonymousClass092, A01(context), A03());
        }
    }

    public C23K A03() {
        C23K c23k = this.A02;
        if (c23k == null) {
            C001200o c001200o = this.A0B;
            C40951t8 c40951t8 = this.A0E;
            C05W c05w = this.A06;
            C002301c c002301c = this.A0C;
            C011505r c011505r = this.A07;
            C06K c06k = this.A05;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 5L, TimeUnit.SECONDS, new PriorityBlockingQueue());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            C23K c23k2 = new C23K(c001200o, c40951t8, c05w, c002301c, c011505r, c06k, threadPoolExecutor);
            this.A02 = c23k2;
            return c23k2;
        }
        return c23k;
    }
}

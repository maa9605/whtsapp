package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.Vibrator;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape7S0100000_I1;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.ClippingLayout;
import com.whatsapp.util.Log;
import com.whatsapp.voicerecorder.VoiceNoteSeekBar;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3bf */
/* loaded from: classes2.dex */
public class C73453bf {
    public static int A1O;
    public static int A1P;
    public static int A1Q;
    public static SoundPool A1R;
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public long A0A;
    public AnimatorSet A0B;
    public ObjectAnimator A0C;
    public PowerManager.WakeLock A0D;
    public View A0E;
    public View A0F;
    public View A0G;
    public View A0H;
    public ViewGroup A0I;
    public ImageButton A0J;
    public ImageView A0K;
    public TextView A0L;
    public TextView A0M;
    public TextView A0N;
    public TextView A0O;
    public TextView A0P;
    public ActivityC02330At A0Q;
    public C20350xO A0R;
    public C0B5 A0S;
    public C38D A0U;
    public AbstractC005302j A0V;
    public C43651xk A0W;
    public AnonymousClass092 A0X;
    public C0HV A0Y;
    public ClippingLayout A0Z;
    public ClippingLayout A0a;
    public C86673y2 A0b;
    public VoiceNoteSeekBar A0c;
    public C73473bh A0d;
    public File A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public final int A0k;
    public final C012005w A0p;
    public final C018508q A0q;
    public final C01B A0r;
    public final C018608r A0s;
    public final C0G2 A0t;
    public final C40261rr A0u;
    public final C03120Eg A0v;
    public final C000400f A0x;
    public final C02E A0y;
    public final AnonymousClass012 A0z;
    public final C000500h A10;
    public final C002301c A11;
    public final C0L9 A12;
    public final C003701t A13;
    public final C0HA A14;
    public final AnonymousClass011 A15;
    public final C41491u0 A16;
    public final C41771uU A17;
    public final C02O A18;
    public final C05U A19;
    public final C008103m A1A;
    public final C42391vf A1B;
    public final InterfaceC002901k A1C;
    public final C2MV A1D;
    public final C42401vg A1E;
    public final C05480Ox A1G;
    public final C0L6 A1H;
    public final Runnable A1J;
    public final boolean A1M;
    public final boolean A1N;
    public final Rect A0l = new Rect();
    public final Handler A0o = new Handler(Looper.getMainLooper()) { // from class: X.3bb
        public long A00;

        {
            C73453bf.this = this;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AbstractC005302j abstractC005302j;
            C73453bf c73453bf = C73453bf.this;
            if (c73453bf.A0d != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - c73453bf.A09;
                int i = (int) (elapsedRealtime / 1000);
                if (i != c73453bf.A06) {
                    c73453bf.A0O.setText(AnonymousClass029.A0g(c73453bf.A11, i));
                    c73453bf.A06 = i;
                }
                c73453bf.A0o.sendEmptyMessageDelayed(0, 50L);
                if (c73453bf.A0W == null && elapsedRealtime > 1000 && c73453bf.A0d.A01.length() > 0) {
                    c73453bf.A0A = c73453bf.A0z.A05();
                    final C41771uU c41771uU = c73453bf.A17;
                    File file = c73453bf.A0d.A01;
                    final AbstractC005302j abstractC005302j2 = c73453bf.A0V;
                    if (c41771uU != null) {
                        StringBuilder sb = new StringBuilder("app/mediajobmanager/enqueuevoicenoteupload enqueuing file: ");
                        sb.append(file);
                        Log.i(sb.toString());
                        C454422b A01 = C454422b.A01(new C22a(true, false), 1, C0DC.A0D, Uri.fromFile(file), null, false, false, null, false);
                        C44551zG c44551zG = c41771uU.A09;
                        final C454622d A05 = c44551zG.A05(A01, true);
                        A05.A01().A03(2);
                        A05.A01().A02();
                        A05.A0S = "mms";
                        A05.A07.A04(new C0KW(file, false));
                        A05.A09.A03(new C0CG() { // from class: X.3FE
                            @Override // X.C0CG
                            public final void A54(Object obj) {
                                C41771uU c41771uU2 = c41771uU;
                                C454622d c454622d = A05;
                                AbstractC005302j abstractC005302j3 = abstractC005302j2;
                                Number number = (Number) obj;
                                if (!c41771uU2.A0K.containsValue(c454622d)) {
                                    c41771uU2.A08.A0B(c41771uU2.A09.A04(c454622d, number.intValue(), C003101m.A0U(abstractC005302j3) ? 3 : 2), null, false);
                                    c454622d.A04();
                                }
                            }
                        }, c41771uU.A0L);
                        C43651xk c43651xk = new C43651xk(A05.A02(), A05);
                        c44551zG.A0A(A05, c43651xk);
                        c73453bf.A0W = c43651xk;
                    } else {
                        throw null;
                    }
                }
                if (this.A00 + 1250 >= System.currentTimeMillis() || (abstractC005302j = c73453bf.A0V) == null) {
                    return;
                }
                this.A00 = System.currentTimeMillis();
                c73453bf.A0s.A0I(abstractC005302j, 1);
                if (c73453bf.A0d.A01.length() > c73453bf.A0r.A07(C01C.A3Y) * 1048576) {
                    StringBuilder A0P = C000200d.A0P("voicenote/filelimit ");
                    A0P.append(c73453bf.A0d.A01.length());
                    Log.i(A0P.toString());
                    c73453bf.A0P(true, false, true);
                }
            }
        }
    };
    public final Runnable A1L = new RunnableEBaseShape9S0100000_I1_1(this, 28);
    public final Handler A0n = new Handler(Looper.getMainLooper());
    public final Runnable A1K = new RunnableEBaseShape9S0100000_I1_1(this, 29);
    public final InterfaceC05880Qp A0w = new InterfaceC05880Qp() { // from class: X.3tO
        {
            C73453bf.this = this;
        }

        @Override // X.InterfaceC05880Qp
        public void ANZ(String str) {
            C35511jG.A01(C73453bf.this.A0Q);
        }

        @Override // X.InterfaceC05880Qp
        public void ANa() {
            ActivityC02330At activityC02330At = C73453bf.this.A0Q;
            int i = Build.VERSION.SDK_INT;
            int i2 = R.string.permission_storage_need_write_access_on_record_audio_v30;
            if (i < 30) {
                i2 = R.string.permission_storage_need_write_access_on_record_audio;
            }
            RequestPermissionActivity.A05(activityC02330At, R.string.permission_storage_need_write_access_on_record_audio_request, i2);
        }

        @Override // X.InterfaceC05880Qp
        public void AQ0(String str) {
            C35511jG.A01(C73453bf.this.A0Q);
        }

        @Override // X.InterfaceC05880Qp
        public void AQ1() {
            ActivityC02330At activityC02330At = C73453bf.this.A0Q;
            int i = Build.VERSION.SDK_INT;
            int i2 = R.string.permission_storage_need_write_access_on_record_audio_v30;
            if (i < 30) {
                i2 = R.string.permission_storage_need_write_access_on_record_audio;
            }
            RequestPermissionActivity.A05(activityC02330At, R.string.permission_storage_need_write_access_on_record_audio_request, i2);
        }
    };
    public final C05490Oy A1F = new C05490Oy() { // from class: X.3tP
        {
            C73453bf.this = this;
        }

        @Override // X.C05490Oy
        public void A00() {
            C73453bf c73453bf = C73453bf.this;
            if (c73453bf.A0S()) {
                c73453bf.A01();
            }
        }
    };
    public final Handler A0m = new Handler(Looper.getMainLooper());
    public final Runnable A1I = new RunnableC73443be(this);
    public C0EH A0T = new C0EH() { // from class: X.3tF
        {
            C73453bf.this = this;
        }

        @Override // X.C0EH
        public final void AHw(C0G3 c0g3) {
            View view;
            View view2;
            C73453bf c73453bf = C73453bf.this;
            double A00 = c0g3.A00();
            StringBuilder sb = new StringBuilder("voicenoterecordingui/onevent/battery change percentage: ");
            sb.append(A00);
            Log.i(sb.toString());
            int i = (A00 > 16.0d ? 1 : (A00 == 16.0d ? 0 : -1));
            View view3 = c73453bf.A0H;
            if (i >= 0) {
                if ((view3 != null && view3.getKeepScreenOn()) || (view2 = c73453bf.A0H) == null || view2.getKeepScreenOn()) {
                    return;
                }
                c73453bf.A0H.setKeepScreenOn(true);
            } else if (view3 == null || !view3.getKeepScreenOn() || (view = c73453bf.A0H) == null || !view.getKeepScreenOn()) {
            } else {
                c73453bf.A0H.setKeepScreenOn(false);
            }
        }
    };

    public boolean A0Q() {
        return true;
    }

    public C73453bf(ActivityC02330At activityC02330At, C0B5 c0b5, View view, AnonymousClass012 anonymousClass012, C003701t c003701t, C018508q c018508q, InterfaceC002901k interfaceC002901k, C012005w c012005w, AnonymousClass011 anonymousClass011, C42391vf c42391vf, C01B c01b, C018608r c018608r, C41491u0 c41491u0, C05480Ox c05480Ox, C0L6 c0l6, C02E c02e, C002301c c002301c, C05U c05u, C40261rr c40261rr, C0HA c0ha, C000400f c000400f, C0L9 c0l9, C42401vg c42401vg, C000500h c000500h, C0G2 c0g2, C2MV c2mv, C41771uU c41771uU, C02O c02o, C008103m c008103m, C03120Eg c03120Eg, boolean z, boolean z2) {
        this.A0Q = activityC02330At;
        this.A0S = c0b5;
        this.A0H = view;
        this.A0z = anonymousClass012;
        this.A13 = c003701t;
        this.A0q = c018508q;
        this.A1C = interfaceC002901k;
        this.A0p = c012005w;
        this.A15 = anonymousClass011;
        this.A1B = c42391vf;
        this.A0r = c01b;
        this.A0s = c018608r;
        this.A16 = c41491u0;
        this.A1G = c05480Ox;
        this.A1H = c0l6;
        this.A0y = c02e;
        this.A11 = c002301c;
        this.A19 = c05u;
        this.A0u = c40261rr;
        this.A14 = c0ha;
        this.A0x = c000400f;
        this.A12 = c0l9;
        this.A10 = c000500h;
        this.A1E = c42401vg;
        this.A0t = c0g2;
        this.A1D = c2mv;
        this.A17 = c41771uU;
        this.A18 = c02o;
        this.A1M = z;
        this.A1N = z2;
        this.A1A = c008103m;
        this.A0v = c03120Eg;
        ((ImageView) view.findViewById(R.id.voice_cancel_animation)).setImageResource(R.drawable.recording_mic_red);
        ((ImageView) view.findViewById(R.id.voice_cancel_trashcan_lid)).setImageResource(R.drawable.rec_bucket_lid);
        ((ImageView) view.findViewById(R.id.voice_cancel_trashcan_body)).setImageResource(R.drawable.rec_bucket_body);
        this.A0O = (TextView) view.findViewById(R.id.voice_note_info);
        ImageView imageView = (ImageView) view.findViewById(R.id.voice_note_btn_slider);
        this.A0K = imageView;
        imageView.setImageResource(R.drawable.input_mic_white_large);
        this.A0K.setBackgroundResource(R.drawable.input_circle_large);
        this.A0K.setPadding(0, 0, 0, 0);
        this.A0P = (TextView) view.findViewById(R.id.voice_note_tip);
        PowerManager A0D = c02e.A0D();
        if (A0D == null) {
            Log.w("voicenoterecordingui pm=null");
        } else {
            this.A0D = C02180Ae.A0R(A0D, 6, "voicenote");
        }
        if (A1R == null) {
            A1R = new SoundPool(1, 1, 0);
            if (c003701t.A0C(445)) {
                A1P = A1R.load(activityC02330At, R.raw.voice_note_fast_start, 0);
            } else {
                A1P = A1R.load(activityC02330At, R.raw.voice_note_start, 0);
            }
            A1P = A1R.load(activityC02330At, R.raw.voice_note_start, 0);
            A1Q = A1R.load(activityC02330At, R.raw.voice_note_stop, 0);
            A1O = A1R.load(activityC02330At, R.raw.voice_note_error, 0);
        }
        this.A0a = (ClippingLayout) view.findViewById(R.id.voice_note_clipping_layout);
        this.A0L = (TextView) view.findViewById(R.id.entry);
        this.A0M = (TextView) view.findViewById(R.id.voice_note_slide_to_cancel);
        this.A0I = (ViewGroup) view.findViewById(R.id.voice_note_draft_layout);
        this.A0c = (VoiceNoteSeekBar) view.findViewById(R.id.voice_note_draft_seekbar);
        TextView textView = (TextView) view.findViewById(R.id.voice_note_draft_time);
        this.A0N = textView;
        C0AT.A0V(textView, 2);
        this.A0F = view.findViewById(R.id.input_layout);
        this.A0Z = (ClippingLayout) view.findViewById(R.id.footer);
        this.A0E = this.A0F.findViewById(R.id.entry);
        if (c002301c.A0M()) {
            this.A0M.setCompoundDrawablesWithIntrinsicBounds(R.drawable.voice_note_slide_to_cancel, 0, 0, 0);
        } else {
            this.A0M.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new C0We(c002301c, C02160Ac.A03(activityC02330At, R.drawable.voice_note_slide_to_cancel)), (Drawable) null);
        }
        final View findViewById = view.findViewById(R.id.voice_note_slide_to_cancel_scroller);
        findViewById.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: X.3bc
            {
                C73453bf.this = this;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                View view2 = findViewById;
                int width = view2.getWidth();
                if (width > 0) {
                    view2.getViewTreeObserver().removeOnPreDrawListener(this);
                    C73453bf c73453bf = C73453bf.this;
                    int compoundPaddingRight = width - (c73453bf.A0M.getCompoundPaddingRight() + c73453bf.A0M.getCompoundPaddingLeft());
                    String charSequence = c73453bf.A0M.getText().toString();
                    float textSize = c73453bf.A0M.getTextSize();
                    while (textSize > 1.0f && c73453bf.A0M.getPaint().measureText(charSequence) >= compoundPaddingRight) {
                        textSize -= 1.0f;
                        c73453bf.A0M.setTextSize(textSize);
                    }
                    return true;
                }
                return true;
            }
        });
        ((ViewGroup) view.findViewById(R.id.voice_recorder_decor)).addView(new View(activityC02330At) { // from class: X.3bd
            @Override // android.view.View
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return true;
            }
        }, -1, -1);
        C20380xR c20380xR = new C20380xR(new C1YT(Choreographer.getInstance()));
        C20350xO c20350xO = new C20350xO(c20380xR);
        Map map = c20380xR.A02;
        String str = c20350xO.A0C;
        if (!map.containsKey(str)) {
            map.put(str, c20350xO);
            this.A0R = c20350xO;
            c20350xO.A05 = new C20360xP(440.0d, 21.0d);
            this.A0G = view.findViewById(R.id.quoted_message_preview_container);
            this.A03 = ViewConfiguration.get(activityC02330At).getScaledTouchSlop() * 1.5f;
            c05480Ox.A01(this.A1F);
            this.A0k = c003701t.A0C(443) ? 0 : 1500;
            this.A1J = new RunnableEBaseShape2S0300000_I1(c0b5, this, c008103m, 9);
            return;
        }
        throw new IllegalArgumentException("spring is already registered");
    }

    public static Animation A00(boolean z) {
        AnimationSet animationSet = new AnimationSet(true);
        AlphaAnimation alphaAnimation = z ? new AlphaAnimation(0.0f, 1.0f) : new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(160L);
        animationSet.addAnimation(alphaAnimation);
        ScaleAnimation scaleAnimation = z ? new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f) : new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(160L);
        animationSet.addAnimation(scaleAnimation);
        animationSet.setDuration(160L);
        return animationSet;
    }

    public void A01() {
        long j;
        File A02;
        File file = null;
        if (A0S() && this.A0V != null) {
            ActivityC02330At activityC02330At = this.A0Q;
            AnonymousClass088.A1C(activityC02330At, this.A0y, activityC02330At.getString(R.string.voice_note_draft_announcement));
            Log.i("voicenote/cachevoicenoteandpreview");
            A0K(false);
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.A09;
            C000200d.A0u("voicenote/cachevoicenoteandpreview duration:", elapsedRealtime);
            A0O(false, elapsedRealtime);
            File file2 = this.A0d.A01;
            if (file2 != null) {
                j = file2.length();
            } else {
                j = 0;
            }
            if (j <= 99 && elapsedRealtime >= 1000) {
                StringBuilder sb = new StringBuilder("voicenote/file too small; not previewing; voiceNoteFileLength=");
                sb.append(j);
                Log.e(sb.toString());
                A08();
            }
            A09();
            if (this.A0W != null) {
                A0N(false, 0);
            }
            this.A12.A00 = false;
            this.A0d = null;
            if (this.A1N) {
                this.A0Q.setRequestedOrientation(-1);
            }
            C42391vf c42391vf = this.A1B;
            AudioManager A0A = c42391vf.A03.A0A();
            if (A0A != null) {
                AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = c42391vf.A01;
                if (onAudioFocusChangeListener == null) {
                    onAudioFocusChangeListener = C72273Zi.A00;
                    c42391vf.A01 = onAudioFocusChangeListener;
                }
                A0A.abandonAudioFocus(onAudioFocusChangeListener);
            }
            PowerManager.WakeLock wakeLock = this.A0D;
            if (wakeLock != null && wakeLock.isHeld()) {
                this.A0D.release();
            }
            A0E();
            if (elapsedRealtime >= 1000 && j > 99) {
                C2MV c2mv = this.A1D;
                AbstractC005302j abstractC005302j = this.A0V;
                AnonymousClass092 anonymousClass092 = this.A0X;
                if (c2mv != null) {
                    C000700j.A04(abstractC005302j, "Jid cannot be null");
                    C000700j.A04(file2, "Voice note file cannot be null");
                    C000700j.A09(AnonymousClass024.A0G(file2.getAbsolutePath()).equals("opus"), "Invalid file type for voice note file. Use opus");
                    if (c2mv.A03.A0A(Environment.getExternalStorageState()) && (A02 = c2mv.A02(abstractC005302j)) != null) {
                        if (anonymousClass092 == null) {
                            File A03 = c2mv.A03(abstractC005302j);
                            if (A03 != null && A03.exists()) {
                                A03.delete();
                            }
                        } else {
                            File A032 = c2mv.A03(abstractC005302j);
                            if (A032 == null) {
                                Log.i("draftvoicenotecache/savequotedmessage/quoted message file is null");
                            } else {
                                AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
                                try {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(C003101m.A07(anonymousClass094.A00));
                                    sb2.append(":;:");
                                    sb2.append(anonymousClass094.A02);
                                    sb2.append(":;:");
                                    sb2.append(anonymousClass094.A01);
                                    String obj = sb2.toString();
                                    FileOutputStream fileOutputStream = new FileOutputStream(A032);
                                    fileOutputStream.write(obj.getBytes());
                                    fileOutputStream.close();
                                } catch (IOException e) {
                                    Log.e("draftvoicenotecache/savequotedmessage/ ", e);
                                }
                            }
                        }
                        if (AnonymousClass024.A0d(c2mv.A00, file2, A02, true)) {
                            file = A02;
                        }
                    }
                    if (file2.exists() && !file2.delete()) {
                        C000200d.A0o(file2, C000200d.A0P("voicenote/failed to delete file "));
                    }
                    A0D();
                    if (file != null) {
                        A0I(file, false);
                    } else {
                        Log.e("voicenote/ error caching voice note for preview");
                        A0M(false);
                    }
                    this.A0e = file;
                    return;
                }
                throw null;
            }
            A0D();
            A0M(false);
            if (file2 != null && file2.exists() && !file2.delete()) {
                C000200d.A0o(file2, C000200d.A0P("voicenote/failed to delete file "));
            }
            this.A0e = null;
            return;
        }
        this.A0e = null;
    }

    public void A02() {
        A0P(false, false, true);
        A07();
        this.A1G.A00(this.A1F);
    }

    public void A03() {
        if (!(this instanceof C81933ph)) {
            if (this instanceof C76863hH) {
                ((C76863hH) this).A00.A1K();
                return;
            }
            return;
        }
        ((C81933ph) this).A00.A1T(false);
    }

    public void A04() {
        if (!(this instanceof C81933ph)) {
            if (this instanceof C76863hH) {
                ((C76863hH) this).A00.A1I();
                return;
            }
            return;
        }
        ((C81933ph) this).A00.A1Q();
    }

    public void A05() {
        if (this.A0Y.A0B()) {
            this.A0Y.A03();
        }
        A0A();
        this.A0n.removeCallbacks(this.A1K);
    }

    public void A06() {
        C42401vg c42401vg;
        TelephonyManager A0G = this.A0y.A0G();
        if (A0G != null && A0G.getCallState() != 0) {
            this.A0S.AUj(R.string.error_voice_messages_disabled_during_cellular_call);
        } else if (C0L6.A01()) {
            this.A0S.AUj(R.string.error_voice_messages_disabled_during_call);
        } else {
            Log.i("voicenote/startvoicenote");
            C000400f c000400f = this.A0x;
            if (c000400f.A0A(this.A0w)) {
                if (c000400f.A02() < ((this.A0r.A07(C01C.A3Y) << 10) << 10)) {
                    C40731sm.A0c(this.A15, this.A0Q, this.A0S, 7);
                } else if (this.A0u.A0H(UserJid.of(this.A0V))) {
                    C002701i.A19(this.A0Q, 106);
                } else if (this.A0d != null) {
                    Log.e("voicenote/startvoicenote/inprogress");
                } else {
                    C008103m c008103m = this.A1A;
                    if (!c008103m.A01()) {
                        c008103m.A01.AGK(570228737);
                    }
                    this.A0E.setFocusable(false);
                    this.A0v.A03();
                    if (this.A1N) {
                        int rotation = this.A0Q.getWindowManager().getDefaultDisplay().getRotation();
                        int i = this.A0Q.getResources().getConfiguration().orientation;
                        if (i != 1) {
                            if (i == 2) {
                                if (rotation != 0 && rotation != 1) {
                                    this.A0Q.setRequestedOrientation(8);
                                } else {
                                    this.A0Q.setRequestedOrientation(0);
                                }
                            }
                        } else if (rotation != 0 && rotation != 1) {
                            this.A0Q.setRequestedOrientation(9);
                        } else {
                            this.A0Q.setRequestedOrientation(1);
                        }
                    }
                    PowerManager.WakeLock wakeLock = this.A0D;
                    if (wakeLock != null) {
                        wakeLock.acquire();
                    }
                    C42391vf c42391vf = this.A1B;
                    AudioManager A0A = c42391vf.A03.A0A();
                    if (A0A != null) {
                        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = c42391vf.A01;
                        if (onAudioFocusChangeListener == null) {
                            onAudioFocusChangeListener = C72273Zi.A00;
                            c42391vf.A01 = onAudioFocusChangeListener;
                        }
                        A0A.requestAudioFocus(onAudioFocusChangeListener, 3, 2);
                    }
                    A0K(false);
                    A0E();
                    this.A08 = A1R.play(A1P, 1.0f, 1.0f, 0, 0, 1.0f);
                    TextView textView = this.A0O;
                    C002301c c002301c = this.A11;
                    textView.setText(AnonymousClass029.A0g(c002301c, 0L));
                    this.A06 = 0;
                    this.A00 = 1.0f;
                    View findViewById = this.A0H.findViewById(R.id.voice_note_pulse);
                    findViewById.setVisibility(0);
                    if (this.A0C == null) {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(findViewById, "alpha", 0.0f, 1.0f);
                        this.A0C = ofFloat;
                        ofFloat.setInterpolator(new TimeInterpolator() { // from class: X.3bN
                            {
                                C73453bf.this = this;
                            }

                            @Override // android.animation.TimeInterpolator
                            public final float getInterpolation(float f) {
                                C73453bf c73453bf = C73453bf.this;
                                if (f > 0.5d) {
                                    return Math.min(f, c73453bf.A00);
                                }
                                return 0.0f;
                            }
                        });
                        this.A0C.setDuration(500L);
                        this.A0C.setRepeatMode(2);
                        this.A0C.setRepeatCount(-1);
                    }
                    this.A0C.start();
                    this.A0K.setVisibility(0);
                    float width = this.A0K.getWidth() / 5.5f;
                    if (c002301c.A0N()) {
                        width = -width;
                    }
                    this.A0K.setTranslationX(width);
                    ImageView imageView = this.A0K;
                    imageView.setTranslationY(imageView.getHeight() / 4);
                    this.A0K.setScaleX(0.5f);
                    this.A0K.setScaleY(0.5f);
                    this.A0K.requestFocus();
                    this.A0R.A06.clear();
                    this.A0R.A06.add(new C86683y3(this, 0));
                    this.A0R.A00(1.0d);
                    this.A0H.findViewById(R.id.buttons).setVisibility(4);
                    this.A0H.findViewById(R.id.emoji_picker_btn).setVisibility(0);
                    View findViewById2 = this.A0H.findViewById(R.id.voice_cancel_trashcan);
                    findViewById2.clearAnimation();
                    findViewById2.setVisibility(8);
                    View findViewById3 = this.A0H.findViewById(R.id.voice_cancel_animation);
                    findViewById3.clearAnimation();
                    findViewById3.setVisibility(8);
                    View findViewById4 = this.A0H.findViewById(R.id.voice_cancel_trashcan_lid);
                    findViewById4.clearAnimation();
                    findViewById4.setVisibility(8);
                    this.A0H.findViewById(R.id.voice_note_slide_to_cancel_layout).setVisibility(0);
                    View findViewById5 = this.A0H.findViewById(R.id.voice_note_slide_to_cancel_animation);
                    findViewById5.setVisibility(0);
                    findViewById5.post(new RunnableEBaseShape6S0200000_I1(this, findViewById5, 18));
                    View findViewById6 = this.A0H.findViewById(R.id.voice_note_layout);
                    findViewById6.setVisibility(0);
                    findViewById6.setClickable(true);
                    C0AT.A0V(findViewById6, 2);
                    TranslateAnimation translateAnimation = new TranslateAnimation(1, c002301c.A0M() ? 1.0f : -1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
                    translateAnimation.setDuration(160L);
                    findViewById6.startAnimation(translateAnimation);
                    View findViewById7 = this.A0H.findViewById(R.id.input_layout_content);
                    findViewById7.clearAnimation();
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation.setDuration(160L);
                    alphaAnimation.setFillBefore(true);
                    alphaAnimation.setFillAfter(true);
                    findViewById7.startAnimation(alphaAnimation);
                    this.A0H.findViewById(R.id.voice_recorder_decor).setVisibility(0);
                    findViewById7.setFocusable(false);
                    C0AT.A0V(findViewById7, 4);
                    File A0L = this.A0p.A0L(C0DD.A0J());
                    if (!c008103m.A01()) {
                        c008103m.A01.AGJ(570228737, "recorder_initializing");
                    }
                    this.A0d = new C73473bh(A0L.getAbsolutePath());
                    this.A12.A00 = true;
                    this.A09 = SystemClock.elapsedRealtime();
                    try {
                        this.A0d.A00.prepare();
                        c42401vg = this.A1E;
                    } catch (Exception unused) {
                        A0P(false, false, true);
                        this.A0S.AUj(R.string.error_setup_recorder);
                    }
                    if (c42401vg != null) {
                        Log.i("voicenote/voicenotestarted");
                        C000700j.A01();
                        Iterator it = c42401vg.A00.iterator();
                        while (true) {
                            C0G5 c0g5 = (C0G5) it;
                            if (!c0g5.hasNext()) {
                                break;
                            }
                            ((C73363bW) c0g5.next()).A02();
                        }
                        if (!c008103m.A01()) {
                            c008103m.A01.AGJ(570228737, "recorder_initialized");
                        }
                        TextView textView2 = this.A0O;
                        Runnable runnable = this.A1J;
                        textView2.removeCallbacks(runnable);
                        int i2 = this.A13.A0C(445) ? 160 : 340;
                        if (!c008103m.A01()) {
                            c008103m.A01.AGJ(570228737, "recorder_starting");
                        }
                        this.A0O.postDelayed(runnable, i2);
                        this.A0i = false;
                        this.A0f = false;
                        if (this.A1M) {
                            this.A0H.findViewById(R.id.voice_note_lock_container).setVisibility(0);
                            View view = this.A0H;
                            if (view != null && this.A0b == null) {
                                ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.voice_note_lock_container);
                                C86673y2 c86673y2 = new C86673y2(this.A0Q);
                                this.A0b = c86673y2;
                                c86673y2.setVisibility(4);
                                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                                layoutParams.gravity = c002301c.A0M() ? 85 : 83;
                                viewGroup.addView(this.A0b, layoutParams);
                            }
                            this.A0g = false;
                            this.A0j = false;
                            this.A0m.postDelayed(this.A1I, this.A0k);
                            return;
                        }
                        return;
                    }
                    throw null;
                }
            }
        }
    }

    public void A07() {
        this.A0n.removeCallbacks(this.A1K);
        if (this.A0Y != null) {
            this.A0J.setOnClickListener(null);
            A05();
            this.A0Y.A05();
            this.A0Y = null;
        }
    }

    public final void A08() {
        this.A0H.findViewById(R.id.voice_note_pulse).setVisibility(4);
        ObjectAnimator objectAnimator = this.A0C;
        if (objectAnimator != null) {
            objectAnimator.end();
        }
        View findViewById = this.A0H.findViewById(R.id.voice_cancel_trashcan);
        findViewById.setVisibility(0);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(213L);
        translateAnimation.setStartOffset(640L);
        translateAnimation.setFillBefore(true);
        findViewById.startAnimation(translateAnimation);
        View findViewById2 = this.A0H.findViewById(R.id.voice_cancel_animation);
        findViewById2.setVisibility(0);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setInterpolator(new DecelerateInterpolator(1.1f));
        TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -3.0f);
        translateAnimation2.setDuration(640L);
        translateAnimation2.setRepeatMode(2);
        translateAnimation2.setRepeatCount(1);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(640L);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.61f, 1.0f, 0.61f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(320L);
        scaleAnimation.setStartOffset(960L);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(rotateAnimation);
        animationSet.addAnimation(translateAnimation2);
        View findViewById3 = this.A0H.findViewById(R.id.voice_cancel_trashcan_lid);
        AnimationSet animationSet2 = new AnimationSet(true);
        TranslateAnimation translateAnimation3 = new TranslateAnimation(1, 0.0f, 1, -0.3f, 1, 0.0f, 1, 0.0f);
        translateAnimation3.setDuration(160L);
        translateAnimation3.setStartOffset(746L);
        translateAnimation3.setFillAfter(true);
        RotateAnimation rotateAnimation2 = new RotateAnimation(0.0f, -60.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation2.setDuration(160L);
        rotateAnimation2.setStartOffset(746L);
        rotateAnimation2.setFillAfter(true);
        animationSet2.addAnimation(rotateAnimation2);
        animationSet2.addAnimation(translateAnimation3);
        animationSet2.setFillAfter(true);
        findViewById3.setVisibility(0);
        findViewById3.startAnimation(animationSet2);
        View findViewById4 = this.A0H.findViewById(R.id.emoji_picker_btn);
        findViewById4.setVisibility(4);
        findViewById2.startAnimation(animationSet);
        animationSet.setAnimationListener(new C84253tR(this, findViewById2, findViewById, findViewById3, findViewById4));
    }

    public final void A09() {
        this.A0K.setTranslationX(this.A04);
        ((ClippingLayout) this.A0H.findViewById(R.id.footer)).setClipBounds(null);
        this.A0a.setClipBounds(null);
    }

    public final void A0A() {
        this.A0J.setImageDrawable(new C0We(this.A11, C02160Ac.A03(this.A0Q, R.drawable.inline_audio_play)));
        this.A0J.setContentDescription(this.A0Q.getString(R.string.play));
    }

    public final void A0B() {
        VoiceNoteSeekBar voiceNoteSeekBar;
        boolean z;
        int progress;
        if (this.A0Y == null || (voiceNoteSeekBar = this.A0c) == null) {
            return;
        }
        if (voiceNoteSeekBar.getProgress() == 0 && !this.A0Y.A0B()) {
            z = true;
            progress = this.A0c.getMax();
        } else {
            z = false;
            progress = this.A0c.getProgress();
        }
        ActivityC02330At activityC02330At = this.A0Q;
        int i = R.string.voice_message_time_elapsed;
        if (z) {
            i = R.string.unsent_voice_message;
        }
        this.A0c.setContentDescription(activityC02330At.getString(i, AnonymousClass029.A0i(this.A11, progress)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x001c, code lost:
        if (X.AnonymousClass029.A1R(r5.A0y, r5.A18, ((com.whatsapp.mentions.MentionableEntry) r0).getStringText()) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0C() {
        /*
            r5 = this;
            android.view.View r1 = r5.A0H
            r0 = 2131362210(0x7f0a01a2, float:1.8344194E38)
            android.view.View r4 = r1.findViewById(r0)
            android.view.View r0 = r5.A0E
            if (r0 == 0) goto L1e
            X.02E r2 = r5.A0y
            X.02O r1 = r5.A18
            com.whatsapp.mentions.MentionableEntry r0 = (com.whatsapp.mentions.MentionableEntry) r0
            java.lang.String r0 = r0.getStringText()
            boolean r0 = X.AnonymousClass029.A1R(r2, r1, r0)
            r3 = 1
            if (r0 != 0) goto L1f
        L1e:
            r3 = 0
        L1f:
            r2 = 8
            r1 = 0
            r0 = 2131364486(0x7f0a0a86, float:1.834881E38)
            android.view.View r0 = r4.findViewById(r0)
            if (r3 == 0) goto L41
            r0.setVisibility(r1)
            r0 = 2131365105(0x7f0a0cf1, float:1.8350066E38)
            android.view.View r0 = r4.findViewById(r0)
            r0.setVisibility(r2)
        L38:
            r4.setVisibility(r1)
            android.view.View r0 = r5.A0F
            r0.requestFocus()
            return
        L41:
            r0.setVisibility(r2)
            r0 = 2131365105(0x7f0a0cf1, float:1.8350066E38)
            android.view.View r0 = r4.findViewById(r0)
            r0.setVisibility(r1)
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73453bf.A0C():void");
    }

    public final void A0D() {
        if (this.A1M) {
            this.A0m.removeCallbacks(this.A1I);
            View view = this.A0H;
            if (view != null && view.getKeepScreenOn()) {
                this.A0H.setKeepScreenOn(false);
            }
            if (this.A0h) {
                this.A0h = false;
                this.A0t.A00(this.A0T);
            }
        }
    }

    public final void A0E() {
        try {
            if (Settings.System.getInt(this.A0Q.getContentResolver(), "haptic_feedback_enabled") != 0) {
                ((Vibrator) this.A0Q.getSystemService("vibrator")).vibrate(75L);
            }
        } catch (Settings.SettingNotFoundException e) {
            Log.e("voicenote/vibrate", e);
        }
    }

    public final void A0F(int i, int i2, float f, float f2) {
        String string = this.A0Q.getString(i2);
        if (!A0S()) {
            AnonymousClass088.A1C(this.A0Q, this.A0y, string);
        }
        this.A0P.setBackground(new C0We(this.A11, this.A0Q.getResources().getDrawable(i)));
        this.A0P.setText(string);
        this.A0P.setTranslationY(f);
        this.A0P.setTranslationX(f2);
        this.A0P.setVisibility(0);
        this.A0P.setAlpha(0.0f);
        this.A0P.animate().alpha(1.0f).setDuration(320L).start();
        C018508q c018508q = this.A0q;
        Runnable runnable = this.A1L;
        Handler handler = c018508q.A02;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 3500L);
    }

    public void A0G(AbstractC005302j abstractC005302j) {
        C000700j.A0A(!A0S(), "Do not update the ptt receiver once the recording has started");
        this.A0V = abstractC005302j;
    }

    public void A0H(File file, boolean z) {
        if (file != null) {
            if (this.A0V != null) {
                File A0D = C0DD.A0D(this.A0Q, this.A0p, this.A18, file, C0DC.A0D, 1);
                if (!file.renameTo(A0D)) {
                    StringBuilder sb = new StringBuilder("voicenote/sendvoicenotefile/failed to rename ");
                    sb.append(file);
                    sb.append(" to ");
                    sb.append(A0D);
                    Log.e(sb.toString());
                    A0D = file;
                }
                C09H c09h = new C09H();
                c09h.A0F = A0D;
                AnonymousClass097 A07 = this.A16.A07(this.A0V, c09h, (byte) 2, 1, this.A0X, z);
                C38D c38d = this.A0U;
                if (c38d != null) {
                    A07.A0e(c38d.A0E());
                }
                if (A07.A00 == 0) {
                    A07.A00 = C0DD.A03(file);
                }
                this.A0s.A0X(A07);
                return;
            }
            throw null;
        }
        throw null;
    }

    public void A0I(File file, boolean z) {
        if (file != null) {
            try {
                C0HV A00 = C0HV.A00(file, 3, null);
                this.A0Y = A00;
                A00.A04();
            } catch (IOException e) {
                this.A0Y = null;
                Log.e("voicenoterecordingui/showvoicenotepreview/ error creating audio player for voice note preview ", e);
            }
            C0HV c0hv = this.A0Y;
            if (c0hv == null) {
                return;
            }
            int A02 = c0hv.A02();
            this.A0J = (ImageButton) this.A0H.findViewById(R.id.voice_note_draft_playback_btn);
            A0A();
            this.A0J.setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1(this, 23));
            this.A0N.setText(AnonymousClass029.A0g(this.A11, A02 / SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS));
            this.A0c.setMax(A02);
            this.A0c.setProgress(0);
            A0B();
            this.A0H.findViewById(R.id.voice_note_layout).setVisibility(8);
            this.A0H.findViewById(R.id.input_layout_content).setVisibility(4);
            this.A0H.findViewById(R.id.voice_note_cancel_btn).setVisibility(8);
            this.A0H.findViewById(R.id.buttons).setVisibility(0);
            this.A0H.findViewById(R.id.voice_note_btn).setVisibility(8);
            View findViewById = this.A0H.findViewById(R.id.send);
            findViewById.setVisibility(0);
            C0AT.A0c(findViewById, new C0AS() { // from class: X.3tJ
                {
                    C73453bf.this = this;
                }

                @Override // X.C0AS
                public void A04(View view, C08420bS c08420bS) {
                    this.A01.onInitializeAccessibilityNodeInfo(view, c08420bS.A02);
                    c08420bS.A06(new C08440bU(16, C73453bf.this.A0Q.getString(R.string.voice_note_draft_send_description)));
                }
            });
            this.A0K.setVisibility(8);
            C86673y2 c86673y2 = this.A0b;
            if (c86673y2 != null) {
                c86673y2.setVisibility(4);
            }
            this.A0I.setVisibility(0);
            this.A0I.setClickable(true);
            this.A0H.findViewById(R.id.voice_note_draft_discard_btn).setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1(this, 24));
            this.A0c.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: X.3bX
                public boolean A00;

                {
                    C73453bf.this = this;
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onProgressChanged(SeekBar seekBar, int i, boolean z2) {
                    C73453bf c73453bf = C73453bf.this;
                    C0HV c0hv2 = c73453bf.A0Y;
                    if (c0hv2 == null || !z2) {
                        return;
                    }
                    try {
                        c0hv2.A09(i);
                        if (i == 0 && !c73453bf.A0Y.A0B()) {
                            i = c73453bf.A0Y.A02();
                        }
                        c73453bf.A0N.setText(AnonymousClass029.A0g(c73453bf.A11, i / SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS));
                    } catch (IOException e2) {
                        StringBuilder A0P = C000200d.A0P("Error seeking media player ");
                        A0P.append(e2.getMessage());
                        Log.e(A0P.toString());
                    }
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStartTrackingTouch(SeekBar seekBar) {
                    C73453bf c73453bf = C73453bf.this;
                    if (c73453bf.A0Y != null) {
                        c73453bf.A0n.removeCallbacks(c73453bf.A1K);
                        this.A00 = c73453bf.A0Y.A0B();
                        if (c73453bf.A0Y.A0B()) {
                            c73453bf.A0Y.A03();
                            c73453bf.A0A();
                        }
                    }
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStopTrackingTouch(SeekBar seekBar) {
                    C73453bf c73453bf = C73453bf.this;
                    C0HV c0hv2 = c73453bf.A0Y;
                    if (c0hv2 == null || !this.A00) {
                        return;
                    }
                    try {
                        c0hv2.A06();
                        c73453bf.A0J.setImageResource(R.drawable.inline_audio_pause);
                        c73453bf.A0J.setContentDescription(c73453bf.A0Q.getString(R.string.pause));
                        c73453bf.A0n.post(c73453bf.A1K);
                    } catch (IOException e2) {
                        StringBuilder A0P = C000200d.A0P("Error resuming playback after seek ");
                        A0P.append(e2.getMessage());
                        Log.e(A0P.toString());
                    }
                    this.A00 = false;
                }
            });
            if (z) {
                this.A1C.AS1(new RunnableEBaseShape9S0100000_I1_1(this, 26));
            }
            this.A0e = file;
            return;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0040, code lost:
        if (X.AnonymousClass029.A1R(r15.A0y, r15.A18, ((com.whatsapp.mentions.MentionableEntry) r0).getStringText()) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0J(boolean r16) {
        /*
            r15 = this;
            r2 = 0
            if (r16 == 0) goto Le
            X.02j r1 = r15.A0V
            if (r1 == 0) goto Le
            X.2MV r0 = r15.A1D
            r0.A05(r1)
            r15.A0e = r2
        Le:
            r15.A07()
            android.view.View r1 = r15.A0H
            r0 = 2131363280(0x7f0a05d0, float:1.8346364E38)
            android.view.View r5 = r1.findViewById(r0)
            r0 = 1
            r5.setFocusable(r0)
            X.C0AT.A0V(r5, r0)
            android.view.View r1 = r15.A0H
            r0 = 2131364486(0x7f0a0a86, float:1.834881E38)
            android.view.View r6 = r1.findViewById(r0)
            X.C0AT.A0c(r6, r2)
            android.view.View r0 = r15.A0E
            if (r0 == 0) goto L42
            X.02E r2 = r15.A0y
            X.02O r1 = r15.A18
            com.whatsapp.mentions.MentionableEntry r0 = (com.whatsapp.mentions.MentionableEntry) r0
            java.lang.String r0 = r0.getStringText()
            boolean r0 = X.AnonymousClass029.A1R(r2, r1, r0)
            r2 = 1
            if (r0 != 0) goto L43
        L42:
            r2 = 0
        L43:
            r0 = 200(0xc8, double:9.9E-322)
            r10 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r2 != 0) goto L77
            r2 = 100
            android.view.animation.AlphaAnimation r3 = X.C000200d.A03(r4, r10, r2)
            X.3tK r2 = new X.3tK
            r2.<init>()
            r3.setAnimationListener(r2)
            r6.startAnimation(r3)
            android.view.animation.AlphaAnimation r6 = new android.view.animation.AlphaAnimation
            r6.<init>(r10, r4)
            android.view.View r3 = r15.A0H
            r2 = 2131365105(0x7f0a0cf1, float:1.8350066E38)
            android.view.View r3 = r3.findViewById(r2)
            r6.setDuration(r0)
            X.3tL r2 = new X.3tL
            r2.<init>()
            r6.setAnimationListener(r2)
            r3.startAnimation(r6)
        L77:
            r7 = 1
            X.01c r2 = r15.A11
            boolean r2 = r2.A0M()
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L84
            r8 = 1065353216(0x3f800000, float:1.0)
        L84:
            r9 = r7
            r11 = r7
            r12 = r10
            r13 = r7
            r14 = r10
            android.view.animation.TranslateAnimation r6 = new android.view.animation.TranslateAnimation
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r6.setDuration(r0)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            r6.setInterpolator(r0)
            X.3tM r0 = new X.3tM
            r0.<init>()
            r6.setAnimationListener(r0)
            r5.startAnimation(r6)
            android.view.animation.AlphaAnimation r2 = new android.view.animation.AlphaAnimation
            r2.<init>(r4, r10)
            r0 = 50
            r2.setDuration(r0)
            X.3tN r0 = new X.3tN
            r0.<init>()
            r2.setAnimationListener(r0)
            android.view.ViewGroup r0 = r15.A0I
            r0.startAnimation(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73453bf.A0J(boolean):void");
    }

    public void A0K(boolean z) {
        if (this.A0P.getVisibility() == 0) {
            C018508q c018508q = this.A0q;
            c018508q.A02.removeCallbacks(this.A1L);
            if (z) {
                this.A0P.setVisibility(8);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(320L);
                this.A0P.startAnimation(alphaAnimation);
                return;
            }
            this.A0P.clearAnimation();
            this.A0P.setVisibility(8);
        }
    }

    public void A0L(boolean z) {
        this.A0j = true;
        this.A0H.findViewById(R.id.voice_note_btn).setVisibility(8);
        this.A0H.findViewById(R.id.buttons).setVisibility(0);
        C0G2 c0g2 = this.A0t;
        if (c0g2.A00.A00() >= 16.0d) {
            View view = this.A0H;
            if (view != null && !view.getKeepScreenOn()) {
                this.A0H.setKeepScreenOn(true);
            }
            if (!this.A0h) {
                this.A0h = true;
                c0g2.A01(this.A0T);
            }
        }
        View findViewById = this.A0H.findViewById(R.id.send);
        findViewById.setScaleX(0.0f);
        findViewById.setScaleY(0.0f);
        findViewById.setVisibility(0);
        findViewById.animate().scaleX(1.0f).scaleY(1.0f).setDuration(200L).setListener(new C73393bZ(this, z, findViewById)).start();
    }

    public final void A0M(boolean z) {
        this.A0H.findViewById(R.id.voice_recorder_decor).setVisibility(8);
        if (this.A1M) {
            C86673y2 c86673y2 = this.A0b;
            if (c86673y2 != null) {
                c86673y2.A00();
            }
            this.A0H.findViewById(R.id.voice_note_lock_container).setVisibility(8);
            this.A0H.findViewById(R.id.send).setEnabled(!TextUtils.isEmpty(this.A0L.getText().toString().trim()));
            this.A0H.findViewById(R.id.voice_note_cancel_btn).setVisibility(8);
        }
        this.A0R.A06.clear();
        C20350xO c20350xO = this.A0R;
        if (c20350xO.A08.A00 != 0.0d && z) {
            c20350xO.A06.add(new C86683y3((int) this.A0K.getTranslationX()) { // from class: X.3yp
                {
                    C73453bf.this = this;
                }

                @Override // X.C1YU
                public void A00(C20350xO c20350xO2) {
                    C73453bf c73453bf = C73453bf.this;
                    c73453bf.A0K.setVisibility(4);
                    c73453bf.A0C();
                }
            });
            this.A0R.A00(0.0d);
        } else {
            c20350xO.A00(0.0d);
            this.A0K.setVisibility(4);
            this.A0K.setScaleX(0.0f);
            this.A0K.setScaleY(0.0f);
            A0C();
        }
        View findViewById = this.A0H.findViewById(R.id.voice_note_layout);
        findViewById.setVisibility(8);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(160L);
        findViewById.startAnimation(alphaAnimation);
        View findViewById2 = this.A0H.findViewById(R.id.input_layout_content);
        findViewById2.clearAnimation();
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation2.setDuration(160L);
        alphaAnimation2.setFillBefore(true);
        alphaAnimation2.setFillAfter(true);
        findViewById2.startAnimation(alphaAnimation2);
        ((ClippingLayout) this.A0H.findViewById(R.id.footer)).setClipBounds(null);
        this.A0a.setClipBounds(null);
        View findViewById3 = this.A0H.findViewById(R.id.voice_note_pulse);
        findViewById3.clearAnimation();
        ((ImageView) findViewById3).getDrawable().setAlpha(255);
    }

    public final void A0N(boolean z, int i) {
        C000200d.A1C("voicenote/onrecordingstopped ", z);
        this.A0W.A01 = true;
        if (z) {
            C09H c09h = new C09H();
            c09h.A0L = true;
            File A03 = this.A0W.A03();
            c09h.A0F = A03;
            C05U c05u = this.A19;
            AbstractC005302j abstractC005302j = this.A0V;
            if (abstractC005302j != null) {
                AnonymousClass097 A032 = c05u.A03(abstractC005302j, c09h, this.A0A, 1, (byte) 2, 0, A03.getName(), c09h.A0F.length(), 1, this.A0X);
                A032.A00 = i;
                C38D c38d = this.A0U;
                if (c38d != null) {
                    A032.A0e(c38d.A0E());
                }
                C018608r c018608r = this.A0s;
                C454622d c454622d = this.A0W.A00;
                if (c018608r != null) {
                    c018608r.A0D(new C04130Ir(Collections.singletonList(A032)), null, null, c454622d, false);
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        } else {
            C41771uU c41771uU = this.A17;
            C43651xk c43651xk = this.A0W;
            if (c41771uU != null) {
                StringBuilder A0P = C000200d.A0P("app/mediajobmanager/cancelVoiceNoteUpload: ");
                A0P.append(c43651xk.A03());
                Log.i(A0P.toString());
                c41771uU.A09.A07(c43651xk.A00);
            } else {
                throw null;
            }
        }
        this.A0W = null;
    }

    public final void A0O(boolean z, long j) {
        try {
            this.A0d.A00.stop();
        } catch (Exception e) {
            if (z && j >= 1000) {
                Log.e("voicenote/stopandreleasevoicerecorder/stop ", e);
            } else {
                StringBuilder A0P = C000200d.A0P("voicenote/stopandreleasevoicerecorder/stop ");
                A0P.append(e.toString());
                Log.i(A0P.toString());
            }
        }
        try {
            this.A0d.A00.close();
        } catch (Exception e2) {
            Log.e("voicenote/stopandreleasevoicerecorder/release", e2);
        }
        C42401vg c42401vg = this.A1E;
        if (c42401vg != null) {
            Log.i("voicenote/voicenotestopped");
            C000700j.A01();
            Iterator it = c42401vg.A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (!c0g5.hasNext()) {
                    return;
                }
                ((C73363bW) c0g5.next()).A03();
            }
        } else {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x00a3, code lost:
        if (r2 <= 99) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x00ac, code lost:
        if (r22 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x00b0, code lost:
        if (r0 < 1000) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x00b4, code lost:
        if (r2 > 99) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x00b8, code lost:
        if (r21.A0W == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x00ba, code lost:
        A0N(false, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x01d0, code lost:
        if (r22 != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0P(boolean r22, boolean r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73453bf.A0P(boolean, boolean, boolean):void");
    }

    public boolean A0R() {
        return this.A0I.getVisibility() == 0;
    }

    public boolean A0S() {
        return this.A0d != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x003d, code lost:
        if (java.lang.Math.abs(r15) <= r22.A03) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0058, code lost:
        if (r11 >= 0.0f) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0T(android.view.View r23, android.view.MotionEvent r24, final boolean r25) {
        /*
            Method dump skipped, instructions count: 711
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73453bf.A0T(android.view.View, android.view.MotionEvent, boolean):boolean");
    }
}

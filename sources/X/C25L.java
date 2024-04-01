package X;

import X.AnonymousClass012;
import X.C02L;
import X.C25L;
import X.C50782Td;
import android.app.Application;
import android.app.Notification;
import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.hardware.SensorEventListener;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.media.SoundPool;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AutomaticGainControl;
import android.media.audiofx.NoiseSuppressor;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.Vibrator;
import android.service.notification.StatusBarNotification;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.WindowManager;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.fieldstats.events.WamCall;
import com.whatsapp.fieldstats.events.WamJoinableCall;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.protocol.VoipStanzaChildNode;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallGroupInfo;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallParticipant;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.JNIUtils;
import com.whatsapp.voipcalling.SignalingXmppCallback;
import com.whatsapp.voipcalling.VoiceFGService;
import com.whatsapp.voipcalling.VoiceService$VoiceServiceEventCallback;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.voipcalling.VoipErrorDialogFragment;
import com.whatsapp.voipcalling.camera.VoipCameraManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.25L */
/* loaded from: classes2.dex */
public class C25L {
    public int A02;
    public int A04;
    public int A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0C;
    public long A0D;
    public BroadcastReceiver A0E;
    public BroadcastReceiver A0F;
    public Ringtone A0G;
    public SoundPool A0H;
    public Uri A0I;
    public Handler A0J;
    public Handler A0K;
    public Handler A0L;
    public Handler A0M;
    public PowerManager.WakeLock A0N;
    public PowerManager.WakeLock A0O;
    public PhoneStateListener A0P;
    public C00U A0Q;
    public WamCall A0R;
    public C72603aI A0S;
    public C84313tX A0T;
    public C84613u2 A0U;
    public C74393dC A0V;
    public AnonymousClass258 A0W;
    public C74563dT A0X;
    public C74563dT A0Y;
    public C0MS A0Z;
    public Integer A0a;
    public Integer A0b;
    public Integer A0c;
    public Integer A0d;
    public Integer A0f;
    public Integer A0g;
    public Integer A0h;
    public Integer A0i;
    public Long A0j;
    public Long A0k;
    public Long A0l;
    public Long A0m;
    public Object A0n;
    public Object A0o;
    public Object A0p;
    public String A0q;
    public String A0r;
    public ScheduledExecutorService A0s;
    public short A0t;
    public boolean A0u;
    public boolean A0v;
    public boolean A0w;
    public boolean A0x;
    public boolean A0y;
    public boolean A10;
    public boolean A11;
    public boolean A12;
    public boolean A13;
    public boolean A14;
    public boolean A15;
    public boolean A16;
    public boolean A18;
    public boolean A19;
    public boolean A1A;
    public boolean A1B;
    public boolean A1D;
    public long[] A1E;
    public final Context A1F;
    public final TelephonyManager A1G;
    public final C03020Dv A1H;
    public final AbstractC000600i A1I;
    public final C012005w A1J;
    public final C018508q A1K;
    public final C02L A1L;
    public final C03150Ej A1N;
    public final C01B A1O;
    public final C0EL A1P;
    public final C010005b A1Q;
    public final C05300Od A1R;
    public final C470029d A1S;
    public final C05W A1T;
    public final C018708s A1U;
    public final C41581uB A1V;
    public final C0E7 A1W;
    public final C02E A1X;
    public final AnonymousClass012 A1Y;
    public final C005102h A1Z;
    public final C000500h A1a;
    public final C002301c A1b;
    public final C01J A1c;
    public final C01R A1d;
    public final C0HY A1e;
    public final C0EA A1f;
    public final C0EC A1g;
    public final C0HA A1h;
    public final C00S A1i;
    public final C0EG A1j;
    public final C41521u3 A1k;
    public final C0EJ A1l;
    public final C0DU A1m;
    public final C22I A1n;
    public final C47872Cx A1o;
    public final C0CB A1p;
    public final C03070Ea A1q;
    public final InterfaceC002901k A1r;
    public final C74203cs A1t;
    public final C50792Te A1u;
    public final C05480Ox A1v;
    public final C50782Td A1w;
    public final C74293d1 A1x;
    public final JNIUtils A1y;
    public final C459824m A1z;
    public final C49762Mg A20;
    public final VoiceService$VoiceServiceEventCallback A21;
    public final C41641uH A22;
    public final C74613dY A23;
    public final C0L6 A24;
    public final C0EW A25;
    public final C2QS A26;
    public final VoipCameraManager A27;
    public volatile C40591sW A2H;
    public volatile Boolean A2I;
    public volatile Integer A2J;
    public volatile String A2K;
    public volatile boolean A2L;
    public static final Object A2M = new AudioManager.OnAudioFocusChangeListener() { // from class: X.3cL
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i) {
            C000200d.A0q("voip audio focus changed: ", i);
        }
    };
    public static final AtomicInteger A2O = new AtomicInteger();
    public static final ThreadPoolExecutor A2N = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());
    public final List A28 = new ArrayList();
    public final Map A2D = new HashMap();
    public double A01 = Double.NaN;
    public double A00 = Double.NaN;
    public final Map A29 = new HashMap();
    public Integer A0e = 1500;
    public boolean A17 = false;
    public int A05 = 30;
    public final Map A2A = new HashMap();
    public boolean A0z = false;
    public boolean A1C = true;
    public volatile int A2G = 0;
    public final Map A2B = new ConcurrentHashMap();
    public final Map A2C = new ConcurrentHashMap();
    public final Set A2E = new HashSet();
    public final Set A2F = Collections.synchronizedSet(new HashSet());
    public int A06 = 0;
    public long A0B = -1;
    public int A03 = 0;
    public final C0PH A1M = new C0PH() { // from class: X.3uB
        {
            C25L.this = this;
        }

        @Override // X.C0PH
        public void AOK(boolean z) {
            C000200d.A1C("voip/onScreenLockChanged:", z);
            C25L c25l = C25L.this;
            c25l.A16 = z;
            if (Voip.A09(Voip.getCallInfo()) && !c25l.A16 && c25l.A0y && c25l.A0O != null) {
                Log.i("onScreenLockChanged screen is turned on, but ear-near is still true, release and reacquire the proximity wake lock.");
                c25l.A0U();
                c25l.A0K.sendEmptyMessageDelayed(14, 6000L);
            }
        }
    };
    public final C84303tW A1s = new C84303tW(this);

    public static void A06(C0EW c0ew, String str) {
        c0ew.A03().remove(str).apply();
    }

    public static void A07(C0EW c0ew, String str, boolean z) {
        c0ew.A03().putBoolean(str, z).apply();
    }

    public C25L(Context context, C41641uH c41641uH, AnonymousClass012 anonymousClass012, C018508q c018508q, JNIUtils jNIUtils, AbstractC000600i abstractC000600i, C02L c02l, C03070Ea c03070Ea, InterfaceC002901k interfaceC002901k, C012005w c012005w, C0EL c0el, AnonymousClass011 anonymousClass011, C0EG c0eg, C01B c01b, C0EA c0ea, C05480Ox c05480Ox, C05300Od c05300Od, C0L6 c0l6, C470029d c470029d, C05W c05w, C01R c01r, C02E c02e, C018708s c018708s, C41521u3 c41521u3, C002301c c002301c, C50782Td c50782Td, C47872Cx c47872Cx, C22I c22i, C0E4 c0e4, C010005b c010005b, C0HY c0hy, C0CB c0cb, C41581uB c41581uB, C0HA c0ha, C04g c04g, C0DU c0du, C01J c01j, C0EC c0ec, VoipCameraManager voipCameraManager, C0EJ c0ej, C0E7 c0e7, C000500h c000500h, C0G2 c0g2, C41401tr c41401tr, C2QS c2qs, C0E5 c0e5, C0EW c0ew, C005102h c005102h, C04000Ia c04000Ia, C50792Te c50792Te, C00S c00s, C03150Ej c03150Ej, C2AY c2ay, C49762Mg c49762Mg, C03020Dv c03020Dv, C0FA c0fa, C459824m c459824m) {
        this.A1F = context;
        this.A22 = c41641uH;
        this.A1Y = anonymousClass012;
        this.A1K = c018508q;
        this.A1y = jNIUtils;
        this.A1I = abstractC000600i;
        this.A1L = c02l;
        this.A1q = c03070Ea;
        this.A1r = interfaceC002901k;
        this.A1J = c012005w;
        this.A1P = c0el;
        this.A1j = c0eg;
        this.A1O = c01b;
        this.A1f = c0ea;
        this.A1v = c05480Ox;
        this.A1R = c05300Od;
        this.A24 = c0l6;
        this.A1S = c470029d;
        this.A1T = c05w;
        this.A1d = c01r;
        this.A1X = c02e;
        this.A1U = c018708s;
        this.A1k = c41521u3;
        this.A1b = c002301c;
        this.A1w = c50782Td;
        this.A1o = c47872Cx;
        this.A1n = c22i;
        this.A1Q = c010005b;
        this.A1e = c0hy;
        this.A1p = c0cb;
        this.A1V = c41581uB;
        this.A1h = c0ha;
        this.A1m = c0du;
        this.A1c = c01j;
        this.A1g = c0ec;
        this.A27 = voipCameraManager;
        this.A1l = c0ej;
        this.A1W = c0e7;
        this.A1a = c000500h;
        this.A26 = c2qs;
        this.A25 = c0ew;
        this.A1Z = c005102h;
        this.A1u = c50792Te;
        this.A1i = c00s;
        this.A1N = c03150Ej;
        this.A20 = c49762Mg;
        this.A1H = c03020Dv;
        this.A1z = c459824m;
        this.A21 = new VoiceService$VoiceServiceEventCallback(this, c04000Ia);
        this.A1t = new C74203cs(c0g2);
        this.A1G = c02e.A0G();
        this.A1x = new C74293d1(anonymousClass011, c01r, c0e4, c41581uB, c04g, c01j, c41401tr, c0e5, c2ay, c0fa, new C84683u9(this));
        this.A23 = new C74613dY(this, context, c02e, c459824m);
    }

    public static final String A00(Jid jid) {
        if (jid instanceof DeviceJid) {
            DeviceJid deviceJid = (DeviceJid) jid;
            return deviceJid.isPrimary() ? deviceJid.userJid.getRawString() : deviceJid.getRawString();
        }
        return jid.getRawString();
    }

    public static void A02(C25L c25l, DeviceJid deviceJid, boolean z) {
        VoipStanzaChildNode[] voipStanzaChildNodeArr;
        if (c25l != null) {
            String currentCallId = Voip.getCurrentCallId();
            C40591sW c40591sW = c25l.A2H;
            if (c40591sW != null) {
                String str = c40591sW.A04;
                if (str.equals(currentCallId) && c40591sW.A06.containsKey(deviceJid)) {
                    c25l.A2H = null;
                    VoipStanzaChildNode voipStanzaChildNode = c40591sW.A02;
                    if (voipStanzaChildNode != null) {
                        ArrayList arrayList = new ArrayList();
                        VoipStanzaChildNode[] childrenCopy = voipStanzaChildNode.getChildrenCopy();
                        if (childrenCopy == null) {
                            throw null;
                        }
                        for (VoipStanzaChildNode voipStanzaChildNode2 : childrenCopy) {
                            C04P[] attributesCopy = voipStanzaChildNode2.getAttributesCopy();
                            if (attributesCopy != null) {
                                int length = attributesCopy.length;
                                int i = 0;
                                while (true) {
                                    if (i < length) {
                                        C04P c04p = attributesCopy[i];
                                        if ("jid".equals(c04p.A02)) {
                                            DeviceJid of = DeviceJid.of(c04p.A01);
                                            if (of != null && !of.equals(deviceJid)) {
                                                arrayList.add(voipStanzaChildNode2);
                                            }
                                        } else {
                                            i++;
                                        }
                                    }
                                }
                            } else {
                                throw null;
                            }
                        }
                        if (!arrayList.isEmpty() && (voipStanzaChildNodeArr = (VoipStanzaChildNode[]) arrayList.toArray(new VoipStanzaChildNode[0])) != null) {
                            c25l.A0l(new C40591sW(c40591sW.A01, str, AnonymousClass029.A0L(c40591sW.A03, voipStanzaChildNodeArr), null));
                        }
                    }
                }
            }
            c25l.A0s.execute(new RunnableEBaseShape0S0110000_I0(deviceJid, z, 15));
            return;
        }
        throw null;
    }

    public static void A03(C25L c25l, UserJid userJid, int i) {
        if (c25l != null) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(userJid);
            C018508q c018508q = c25l.A1K;
            c018508q.A02.post(new RunnableEBaseShape0S1201000_I0(c25l, arrayList, null, i, 4));
            return;
        }
        throw null;
    }

    public static void A04(C25L c25l, List list, int i) {
        VoipErrorDialogFragment voipErrorDialogFragment = null;
        if (c25l != null) {
            CallInfo callInfo = Voip.getCallInfo();
            if (i != 1) {
                if (i != 2) {
                    if (i == 6) {
                        voipErrorDialogFragment = VoipErrorDialogFragment.A01(6, VoipErrorDialogFragment.A00());
                    }
                } else if (callInfo != null) {
                    voipErrorDialogFragment = VoipErrorDialogFragment.A03(list, callInfo.participants.size(), true);
                }
            } else if (callInfo != null) {
                voipErrorDialogFragment = VoipErrorDialogFragment.A03(list, callInfo.participants.size(), false);
            }
            C0B5 c0b5 = c25l.A1K.A00;
            if (c0b5 == null || voipErrorDialogFragment == null) {
                return;
            }
            c0b5.AUh(voipErrorDialogFragment);
            return;
        }
        throw null;
    }

    public static void A05(C25L c25l, boolean z) {
        C0EW c0ew;
        if (c25l != null) {
            String A06 = Voip.A06("test.name");
            if (A06 != null) {
                C000200d.A0i(c25l.A1a, "voip_call_ab_test_bucket", A06);
            }
            Integer A01 = Voip.A01("options.spam_call_threshold_seconds");
            if (A01 != null) {
                c25l.A05 = A01.intValue();
            }
            c25l.A0c = Voip.A01("options.offer_ack_timeout");
            c25l.A0a = Voip.A01("options.android_audio_mode_in_call");
            Integer A012 = Voip.A01("options.audio_level_adjust");
            if (A012 != null) {
                c25l.A07 = A012.intValue();
            }
            Integer A013 = Voip.A01("options.call_start_delay");
            if (A013 != null) {
                c0ew = c25l.A25;
                C000200d.A0n(c0ew, "call_start_delay", A013.intValue());
            } else {
                c0ew = c25l.A25;
                if (c0ew.A04().contains("call_start_delay")) {
                    A06(c0ew, "call_start_delay");
                }
            }
            Integer A014 = Voip.A01("vid_driver.camera_width");
            Integer A015 = Voip.A01("vid_driver.camera_height");
            if (A014 != null && A015 != null) {
                int intValue = A014.intValue();
                c0ew.A03().putInt("video_call_front_camera_width", intValue).putInt("video_call_front_camera_height", A015.intValue()).apply();
            } else if (c0ew.A0B()) {
                c0ew.A03().remove("video_call_front_camera_width").remove("video_call_front_camera_height").apply();
            }
            Integer A016 = Voip.A01("vid_driver.back_camera_width");
            Integer A017 = Voip.A01("vid_driver.back_camera_height");
            if (A016 != null && A017 != null) {
                int intValue2 = A016.intValue();
                c0ew.A03().putInt("video_call_back_camera_width", intValue2).putInt("video_call_back_camera_height", A017.intValue()).apply();
            } else if (c0ew.A0A()) {
                c0ew.A03().remove("video_call_back_camera_width").remove("video_call_back_camera_height").apply();
            }
            Integer A018 = Voip.A01("options.portrait_mode_threshold");
            if (A018 != null) {
                C000200d.A0n(c0ew, "portrait_mode_threshold", A018.intValue());
            } else {
                A06(c0ew, "portrait_mode_threshold");
            }
            Integer A019 = Voip.A01("options.landscape_mode_threshold");
            if (A019 != null) {
                C000200d.A0n(c0ew, "landscape_mode_threshold", A019.intValue());
            } else {
                A06(c0ew, "landscape_mode_threshold");
            }
            Integer A0110 = Voip.A01("options.enable_callee_message_buffer");
            if (A0110 != null) {
                c0ew.A03().putInt("call_enable_callee_message_buffer", A0110.intValue()).apply();
            } else {
                A06(c0ew, "call_enable_callee_message_buffer");
            }
            Integer A0111 = Voip.A01("options.enable_caller_message_buffer");
            if (A0111 != null) {
                c0ew.A03().putInt("call_enable_caller_message_buffer", A0111.intValue()).apply();
            } else {
                A06(c0ew, "call_enable_caller_message_buffer");
            }
            Boolean A00 = Voip.A00("options.enable_touch_near_ear_fix");
            if (A00 != null) {
                A07(c0ew, "enable_touch_near_ear_fix", A00.booleanValue());
            } else {
                A06(c0ew, "enable_touch_near_ear_fix");
            }
            Boolean A002 = Voip.A00("options.android_telecom_framework_caller");
            if (A002 != null) {
                A07(c0ew, "enable_telecom_framework_caller", A002.booleanValue());
            } else {
                A06(c0ew, "enable_telecom_framework_caller");
            }
            Boolean A003 = Voip.A00("options.enable_vqm");
            if (A003 != null) {
                A07(c0ew, "enable_vid_quality_manager", A003.booleanValue());
            } else {
                A06(c0ew, "enable_vid_quality_manager");
            }
            if (z) {
                Boolean A004 = Voip.A00("options.disable_device_specific_camera_size");
                if (A004 != null) {
                    A07(c0ew, "disable_device_specific_camera_size", A004.booleanValue());
                } else {
                    A06(c0ew, "disable_device_specific_camera_size");
                }
                String A062 = Voip.A06("options.android_camera2_support_level");
                if (A062 != null) {
                    c0ew.A03().putString("camera2_required_hardware_support_level", A062).apply();
                } else {
                    A06(c0ew, "camera2_required_hardware_support_level");
                }
                Boolean A005 = Voip.A00("options.force_passive_capture_dev_stream_role");
                if (A005 != null) {
                    A07(c0ew, "force_passive_capture_dev_stream_role", A005.booleanValue());
                } else {
                    A06(c0ew, "force_passive_capture_dev_stream_role");
                }
                Boolean A006 = Voip.A00("options.start_video_call_no_preview");
                if (A006 != null) {
                    A07(c0ew, "start_video_call_no_preview", A006.booleanValue());
                } else {
                    A06(c0ew, "start_video_call_no_preview");
                }
                Boolean A007 = Voip.A00("options.enable_gcall_codec_nego_fix");
                if (A007 != null) {
                    A07(c0ew, "enable_gcall_codec_nego_fix", A007.booleanValue());
                } else {
                    A06(c0ew, "enable_gcall_codec_nego_fix");
                }
                StringBuilder A0P = C000200d.A0P("Updating gcall_codec_nego sys pref to ");
                A0P.append(c0ew.A04().getBoolean("enable_gcall_codec_nego_fix", false));
                Log.i(A0P.toString());
                return;
            }
            return;
        }
        throw null;
    }

    public int A08() {
        return this.A23.A00;
    }

    public final long A09(boolean z) {
        int A07;
        if (z) {
            C01B c01b = this.A1O;
            if (AnonymousClass029.A1O(c01b)) {
                synchronized (C01B.class) {
                    A07 = c01b.A07(C01C.A33) * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
                }
                return A07;
            }
            return 45000L;
        }
        return 45000L;
    }

    public final C0D3 A0A(UserJid userJid, boolean z, String str, int i) {
        return this.A1e.A04(new C07950aM(userJid, z, AnonymousClass029.A0t(str), i));
    }

    public C74403dD A0B(String str) {
        if (str == null || Build.VERSION.SDK_INT < 28) {
            return null;
        }
        return (C74403dD) this.A1z.A03().A05.get(str);
    }

    public final C74553dS A0C(String str) {
        Map map = this.A29;
        C74553dS c74553dS = (C74553dS) map.get(str);
        if (c74553dS == null) {
            C74553dS c74553dS2 = new C74553dS();
            map.put(str, c74553dS2);
            return c74553dS2;
        }
        return c74553dS;
    }

    public String A0D(String str, String str2) {
        C0HY c0hy;
        C0D3 A02;
        long A022 = this.A25.A02(str);
        if (A022 != -1 && (A02 = (c0hy = this.A1e).A02(A022)) != null) {
            String str3 = A02.A07;
            if (str3 != null || str2 == null) {
                return str3;
            }
            synchronized (A02) {
                if (A02.A07 != null) {
                    C000700j.A08(false, "CallRandomId cannot be set twice!");
                } else {
                    A02.A0F = true;
                    A02.A07 = str2;
                }
            }
            c0hy.A08(A02);
        }
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x0047, code lost:
        if (r3.A0E.contains(r8) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0071, code lost:
        if (r3.A0E.contains(r6) != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map A0E(java.util.Map r13) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25L.A0E(java.util.Map):java.util.Map");
    }

    public void A0F() {
        StringBuilder sb = new StringBuilder("voip/service/create ");
        sb.append(this);
        Log.i(sb.toString());
        this.A0L = new Handler(new Handler.Callback() { // from class: X.3cF
            {
                C25L.this = this;
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                C25L c25l = C25L.this;
                C000700j.A01();
                CallInfo callInfo = Voip.getCallInfo();
                if (callInfo != null) {
                    boolean z = callInfo.callState == Voip.CallState.ACTIVE;
                    long j = callInfo.callDuration;
                    if (z) {
                        C05480Ox c05480Ox = c25l.A1v;
                        C000700j.A01();
                        Iterator it = c05480Ox.A00.iterator();
                        while (true) {
                            C0G5 c0g5 = (C0G5) it;
                            if (!c0g5.hasNext()) {
                                break;
                            }
                            ((C05490Oy) c0g5.next()).A01(j);
                        }
                    }
                    Voip.CallState callState = callInfo.callState;
                    Voip.CallState callState2 = Voip.CallState.RECEIVED_CALL;
                    if (callState == callState2) {
                        c25l.A0Q();
                    }
                    if (callInfo.callState != callState2 && !callInfo.isPeerRequestingUpgrade()) {
                        c25l.A0K();
                    }
                    C0MS c0ms = c25l.A0Z;
                    if (c0ms != null) {
                        VoipActivityV2 voipActivityV2 = (VoipActivityV2) c0ms;
                        C000700j.A01();
                        String str = voipActivityV2.A1Q;
                        if (str != null && str.equals(callInfo.callWaitingInfo.A04)) {
                            callInfo = CallInfo.convertCallWaitingInfoToCallInfo(callInfo);
                        }
                        voipActivityV2.A2G(callInfo);
                        voipActivityV2.findViewById(R.id.call_debug_stats);
                        voipActivityV2.A1u();
                        if (!AnonymousClass029.A1O(voipActivityV2.A0m) && voipActivityV2.A1B != null && callInfo.callState == Voip.CallState.ACTIVE && voipActivityV2.A09 == 0 && callInfo.bytesReceived > 0 && callInfo.isCaller && !callInfo.videoEnabled && callInfo.callDuration < 3000) {
                            voipActivityV2.A2S(voipActivityV2.getString(R.string.voip_call_connected), 0);
                        }
                        voipActivityV2.A09 = callInfo.bytesReceived;
                    }
                    C74203cs c74203cs = c25l.A1t;
                    long currentTimeMillis = System.currentTimeMillis();
                    boolean z2 = currentTimeMillis - c74203cs.A02 > 60000;
                    if (z2) {
                        double A00 = c74203cs.A00();
                        c74203cs.A00 = A00;
                        if (c74203cs.A02 == 0 || Double.isNaN(c74203cs.A01)) {
                            c74203cs.A01 = A00;
                        }
                        c74203cs.A02 = currentTimeMillis;
                    }
                    double d = c74203cs.A01;
                    if (!Double.isNaN(d)) {
                        double d2 = c74203cs.A00;
                        if (!Double.isNaN(d2)) {
                            long j2 = j / 60000;
                            double d3 = d - d2;
                            if (j2 <= 0) {
                                j2 = 1;
                            }
                            double d4 = d3 / j2;
                            if (z2) {
                                boolean A01 = c74203cs.A03.A00.A01();
                                C000200d.A1C("voipcalling/BatteryStateDelegate/isDeviceCharging is device charging returned: ", A01);
                                int batteryState = Voip.setBatteryState((int) d4, (int) c74203cs.A00, A01);
                                StringBuilder sb2 = new StringBuilder("voipcalling/BatteryStateDelegate/updateBattery setting battery state for vid_rc_battery: ");
                                sb2.append(d4);
                                sb2.append(" ");
                                sb2.append(c74203cs.A00);
                                sb2.append(" ");
                                sb2.append(A01);
                                sb2.append(" got result: ");
                                sb2.append(batteryState);
                                Log.i(sb2.toString());
                            }
                        }
                    }
                } else {
                    Log.w("voip/periodicalUpdateHandler we are not in an active call");
                }
                c25l.A0L.sendEmptyMessageDelayed(0, 1000L);
                return true;
            }
        });
        this.A0J = new Handler(new Handler.Callback() { // from class: X.3cO
            {
                C25L.this = this;
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                Voip.CallState callState;
                C25L c25l = C25L.this;
                if (!C0L6.A01()) {
                    Log.e("voip/callTimeoutHandler we are not in an active call");
                    return false;
                }
                CallInfo callInfo = Voip.getCallInfo();
                int i = message.what;
                if (i == 0) {
                    Log.i("voip/call/not-accept-timeout");
                    if (!AnonymousClass029.A1O(c25l.A1O) || callInfo == null || !callInfo.isGroupCall || ((callState = callInfo.callState) != Voip.CallState.CALLING && callState != Voip.CallState.PRE_ACCEPT_RECEIVED)) {
                        c25l.A0b(7, null);
                        return true;
                    }
                    return true;
                } else if (i == 1) {
                    Log.i("voip/call/accepted-but-not-active-timeout");
                    c25l.A0b(8, null);
                    return true;
                } else if (i == 2) {
                    Log.i("voip/call/send-call-offer-timeout");
                    if (c25l.A1W.A03(true) == 0) {
                        c25l.A0b(9, c25l.A1b.A06(R.string.voip_call_failed_no_network));
                        return true;
                    }
                    return true;
                } else if (i == 3) {
                    Log.i("voip/call/busy-tone-timeout");
                    c25l.A0b(10, null);
                    return true;
                } else if (i == 4) {
                    Log.i("voip/call/ringtone-timeout");
                    c25l.A0K();
                    return true;
                } else if (i != 5) {
                    return false;
                } else {
                    Log.i("voip/call/caller-lonely-state-timeout");
                    if (AnonymousClass029.A1O(c25l.A1O) && callInfo != null && callInfo.isGroupCall) {
                        Voip.CallState callState2 = callInfo.callState;
                        if (callState2 == Voip.CallState.CALLING || callState2 == Voip.CallState.PRE_ACCEPT_RECEIVED) {
                            c25l.A0b(7, null);
                            return true;
                        }
                        return true;
                    }
                    return true;
                }
            }
        });
        this.A0M = new Handler(new Handler.Callback() { // from class: X.3cG
            {
                C25L.this = this;
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                C25L c25l = C25L.this;
                int i = message.what;
                if (i != 0) {
                    if (i != 1) {
                        return false;
                    }
                    if (C0L6.A01()) {
                        return true;
                    }
                    c25l.A0W();
                    return true;
                } else if (!C0L6.A01()) {
                    if (C25L.A2O.get() > 0) {
                        c25l.A0P();
                        return true;
                    }
                    Log.i("voip/service/stopSelfHandler stopSelf now");
                    c25l.A1A = true;
                    c25l.A22.A00.obtainMessage(2).sendToTarget();
                    return true;
                } else {
                    return true;
                }
            }
        });
        this.A0K = new Handler(new Handler.Callback() { // from class: X.3cJ
            {
                C25L.this = this;
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return C25L.this.A10(message);
            }
        });
        this.A0s = new ScheduledThreadPoolExecutor(new ThreadFactory() { // from class: X.3cM
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, "VoIP Signaling Thread");
            }
        }) { // from class: X.3dQ
            @Override // java.util.concurrent.ThreadPoolExecutor
            public void afterExecute(Runnable runnable, Throwable th) {
                super.afterExecute(runnable, th);
                if (runnable instanceof Future) {
                    Future future = (Future) runnable;
                    if (future.isDone()) {
                        try {
                            future.get();
                        } catch (InterruptedException unused) {
                        } catch (ExecutionException e) {
                            th = e.getCause();
                        }
                    }
                }
                if (th != null) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
                }
            }
        };
        this.A0S = new C72603aI(this.A1X);
        this.A0P = new PhoneStateListener() { // from class: X.3dN
            public boolean A00 = false;

            {
                C25L.this = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:51:0x0029, code lost:
                if (r1.isSpeakerphoneOn() == false) goto L35;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v0 */
            /* JADX WARN: Type inference failed for: r4v1 */
            /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
            /* JADX WARN: Type inference failed for: r4v3 */
            @Override // android.telephony.PhoneStateListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onCallStateChanged(int r7, java.lang.String r8) {
                /*
                    r6 = this;
                    X.25L r2 = X.C25L.this
                    X.02E r0 = r2.A1X
                    android.media.AudioManager r1 = r0.A0A()
                    java.lang.String r0 = "voip/phoneStateListener/onCallStateChanged state: "
                    java.lang.StringBuilder r5 = X.C000200d.A0P(r0)
                    if (r7 == 0) goto L61
                    r0 = 1
                    if (r7 == r0) goto L5e
                    r0 = 2
                    if (r7 == r0) goto L5b
                    java.lang.String r0 = "UNKNOWN_TELEPHONY_CALL_STATE"
                L18:
                    r5.append(r0)
                    java.lang.String r0 = " using speaker: "
                    r5.append(r0)
                    r4 = 0
                    r3 = 1
                    if (r1 == 0) goto L2b
                    boolean r1 = r1.isSpeakerphoneOn()
                    r0 = 1
                    if (r1 != 0) goto L2c
                L2b:
                    r0 = 0
                L2c:
                    X.C000200d.A1V(r5, r0)
                    java.lang.String r0 = com.whatsapp.voipcalling.Voip.getCurrentCallId()
                    boolean r1 = r2.A13(r0)
                    r1 = r1 ^ r3
                    java.lang.String r0 = "PhoneStateListener is only used when Telecom Framework is not enabled"
                    X.C000700j.A08(r1, r0)
                    r2.A04 = r7
                    r0 = 2
                    if (r7 == r0) goto L48
                    boolean r0 = r6.A00
                    if (r0 == 0) goto L49
                    if (r7 != r3) goto L49
                L48:
                    r4 = 1
                L49:
                    boolean r0 = r6.A00
                    if (r4 != r0) goto L6a
                    com.whatsapp.voipcalling.CallInfo r1 = com.whatsapp.voipcalling.Voip.getCallInfo()
                    if (r1 == 0) goto L5a
                    if (r7 == 0) goto L64
                    X.3dY r0 = r2.A23
                    r0.A02(r1)
                L5a:
                    return
                L5b:
                    java.lang.String r0 = "CALL_STATE_OFFHOOK"
                    goto L18
                L5e:
                    java.lang.String r0 = "CALL_STATE_RINGING"
                    goto L18
                L61:
                    java.lang.String r0 = "CALL_STATE_IDLE"
                    goto L18
                L64:
                    X.3dY r0 = r2.A23
                    r0.A01(r1)
                    return
                L6a:
                    r6.A00 = r4
                    android.os.Handler r0 = r2.A0K
                    r1 = 6
                    android.os.Message r3 = r0.obtainMessage(r1, r7, r4)
                    android.os.Handler r0 = r2.A0K
                    r0.removeMessages(r1)
                    android.os.Handler r2 = r2.A0K
                    if (r4 == 0) goto L80
                    r2.sendMessage(r3)
                    return
                L80:
                    r0 = 1000(0x3e8, double:4.94E-321)
                    r2.sendMessageDelayed(r3, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C74503dN.onCallStateChanged(int, java.lang.String):void");
            }
        };
        this.A0E = new BroadcastReceiver() { // from class: X.3dO
            {
                C25L.this = this;
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                    C25L.this.A0K();
                    Log.i("Screen is being turned off");
                }
            }
        };
        this.A0F = new BroadcastReceiver() { // from class: X.3dP
            {
                C25L.this = this;
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                CallInfo callInfo;
                if (!"android.intent.action.USER_PRESENT".equals(intent.getAction()) || (callInfo = Voip.getCallInfo()) == null || callInfo.callState != Voip.CallState.RECEIVED_CALL || Build.VERSION.SDK_INT < 21) {
                    return;
                }
                C25L c25l = C25L.this;
                C0MS c0ms = c25l.A0Z;
                if (c0ms == null || !((VoipActivityV2) c0ms).A1d) {
                    Log.i("voip/unlockReceiver generate headsup notification when user unlock the screen in RECEIVED_CALL state");
                    c25l.A0h(callInfo, 1, false);
                }
            }
        };
        this.A0T = new C84313tX(this);
        C74613dY c74613dY = this.A23;
        if (c74613dY != null) {
            Log.i("voip/audio_route/init");
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            c74613dY.A02 = defaultAdapter;
            if (defaultAdapter != null) {
                try {
                    defaultAdapter.getProfileProxy(c74613dY.A09, c74613dY.A0G, 1);
                } catch (Exception e) {
                    Log.e(e);
                }
            } else {
                Log.e("voip/audio_route/init failed to get bluetoothAdapter");
            }
            if (Build.VERSION.SDK_INT >= 28) {
                c74613dY.A0D.A04(c74613dY.A0C);
            }
            C74293d1 c74293d1 = this.A1x;
            c74293d1.A06.A01(c74293d1.A05);
            c74293d1.A01.A00(c74293d1.A00);
            c74293d1.A0A.A00(c74293d1.A09);
            this.A1N.A01(this.A1M);
            C00U c00u = new C00U() { // from class: X.3uA
                @Override // X.C00U
                public void ALb() {
                }

                {
                    C25L.this = this;
                }

                @Override // X.C00U
                public void ALc() {
                    C25L.this.A0a(27, null);
                }
            };
            this.A0Q = c00u;
            this.A1R.A0i.add(c00u);
            if (Build.VERSION.SDK_INT >= 28) {
                C86733yB c86733yB = new C86733yB(this);
                this.A0W = c86733yB;
                this.A1z.A04(c86733yB);
            } else {
                this.A0W = null;
            }
            Voip.nativeRegisterEventCallback(this.A21);
            if (Voip.A00 == null) {
                DefaultCryptoCallback defaultCryptoCallback = new DefaultCryptoCallback(this.A1L);
                Voip.nativeRegisterCryptoCallback(defaultCryptoCallback);
                Voip.A00 = defaultCryptoCallback;
            }
            Voip.nativeRegisterSignalingXmppCallback(new SignalingXmppCallback(this, this.A1Y, this.A1L, this.A1w) { // from class: com.whatsapp.voipcalling.VoiceService$DefaultSignalingXmppCallback
                public final C50782Td callSendMethods;
                public final C02L meManager;
                public final C25L service;
                public final AnonymousClass012 time;

                {
                    this.service = this;
                    this.time = r2;
                    this.meManager = r3;
                    this.callSendMethods = r4;
                }

                /* JADX WARN: Code restructure failed: missing block: B:53:0x004a, code lost:
                    if (r2.equals("reject") != false) goto L15;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:60:0x0067, code lost:
                    if (r2.equals("video") != false) goto L15;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:61:0x0069, code lost:
                    r9.callSendMethods.A00(new X.C04990Mu(r4, r10, r11, r12));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:62:0x0073, code lost:
                    return;
                 */
                @Override // com.whatsapp.voipcalling.SignalingXmppCallback
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void sendCallStanza(com.whatsapp.jid.Jid r10, java.lang.String r11, com.whatsapp.protocol.VoipStanzaChildNode r12) {
                    /*
                        r9 = this;
                        r7 = r12
                        java.lang.String r2 = r12.tag
                        X.012 r3 = r9.time
                        X.02L r1 = r9.meManager
                        r0 = 0
                        java.lang.String r4 = X.C05V.A02(r3, r1, r0)
                        int r0 = r2.hashCode()
                        r3 = 1
                        r6 = r11
                        switch(r0) {
                            case -1423461112: goto L20;
                            case -934710369: goto L44;
                            case 105650780: goto L4d;
                            case 112202875: goto L61;
                            case 1063018407: goto L74;
                            case 2035990113: goto L89;
                            default: goto L15;
                        }
                    L15:
                        X.2Td r1 = r9.callSendMethods
                        X.0Mu r0 = new X.0Mu
                        r0.<init>(r4, r10, r11, r12)
                        r1.A01(r0)
                        return
                    L20:
                        java.lang.String r0 = "accept"
                        boolean r0 = r2.equals(r0)
                        if (r0 == 0) goto L15
                        X.25L r3 = r9.service
                        X.3dT r0 = r3.A0X
                        if (r0 != 0) goto L39
                        long r0 = android.os.SystemClock.elapsedRealtime()
                        X.3dT r2 = new X.3dT
                        r2.<init>(r4, r0)
                        r3.A0X = r2
                    L39:
                        X.2Td r1 = r9.callSendMethods
                        X.0Mu r0 = new X.0Mu
                        r0.<init>(r4, r10, r11, r12)
                        r1.A01(r0)
                        return
                    L44:
                        java.lang.String r0 = "reject"
                        boolean r0 = r2.equals(r0)
                        if (r0 == 0) goto L15
                        goto L69
                    L4d:
                        java.lang.String r0 = "offer"
                        boolean r0 = r2.equals(r0)
                        if (r0 == 0) goto L15
                        X.25L r2 = r9.service
                        r1 = 0
                        X.1sW r0 = new X.1sW
                        r0.<init>(r10, r11, r12, r1)
                        r2.A0l(r0)
                        return
                    L61:
                        java.lang.String r0 = "video"
                        boolean r0 = r2.equals(r0)
                        if (r0 == 0) goto L15
                    L69:
                        X.2Td r1 = r9.callSendMethods
                        X.0Mu r0 = new X.0Mu
                        r0.<init>(r4, r10, r11, r12)
                        r1.A00(r0)
                        return
                    L74:
                        java.lang.String r0 = "enc_rekey"
                        boolean r0 = r2.equals(r0)
                        if (r0 == 0) goto L15
                        X.25L r3 = r9.service
                        com.whatsapp.jid.DeviceJid r5 = com.whatsapp.jid.DeviceJid.of(r10)
                        if (r5 == 0) goto L9a
                        r8 = 0
                        r3.A0s(r4, r5, r6, r7, r8)
                        return
                    L89:
                        java.lang.String r0 = "terminate"
                        boolean r0 = r2.equals(r0)
                        if (r0 == 0) goto L15
                        X.25L r2 = r9.service
                        int r1 = r2.A2G
                        r0 = 14
                        if (r1 != r0) goto L9c
                        return
                    L9a:
                        r0 = 0
                        throw r0
                    L9c:
                        r2.A0e(r10, r11, r3)
                        X.2Td r1 = r9.callSendMethods
                        X.0Mu r0 = new X.0Mu
                        r0.<init>(r4, r10, r11, r12)
                        r1.A01(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoiceService$DefaultSignalingXmppCallback.sendCallStanza(com.whatsapp.jid.Jid, java.lang.String, com.whatsapp.protocol.VoipStanzaChildNode):void");
                }
            });
            if (Build.VERSION.SDK_INT >= 22) {
                C74393dC c74393dC = new C74393dC((ConnectivityManager) this.A1F.getSystemService("connectivity"));
                this.A0V = c74393dC;
                c74393dC.A06.execute(new RunnableEBaseShape7S0100000_I0_7(c74393dC, 40));
            } else {
                this.A0V = null;
            }
            Log.i("voip/service/created");
            return;
        }
        throw null;
    }

    public void A0G() {
        int intValue;
        C74393dC c74393dC;
        StringBuilder sb = new StringBuilder("voip/service/destroy ");
        sb.append(this);
        Log.i(sb.toString());
        try {
            A0K();
        } catch (Exception e) {
            Log.e(e);
        }
        A0T();
        SoundPool soundPool = this.A0H;
        if (soundPool != null) {
            this.A0i = null;
            soundPool.release();
            this.A0H = null;
        }
        C74613dY c74613dY = this.A23;
        if (c74613dY != null) {
            Log.i("voip/audio_route/deinit");
            c74613dY.A05 = true;
            if (Build.VERSION.SDK_INT >= 28) {
                c74613dY.A0D.A03().A00(c74613dY.A0C);
            }
            if (c74613dY.A02 != null && c74613dY.A03 != null) {
                StringBuilder sb2 = new StringBuilder("voip/audio_route/destroy closing profile proxy for ");
                sb2.append(c74613dY);
                Log.i(sb2.toString());
                c74613dY.A02.closeProfileProxy(1, c74613dY.A03);
            }
            c74613dY.A02 = null;
            c74613dY.A03 = null;
            A0V();
            if (Build.VERSION.SDK_INT >= 22 && (c74393dC = this.A0V) != null) {
                c74393dC.A06.execute(new RunnableEBaseShape7S0100000_I0_7(c74393dC, 39));
                c74393dC.A06.shutdown();
                this.A0V = null;
            }
            Voip.nativeUnregisterEventCallback();
            Voip.nativeUnregisterSignalingXmppCallback();
            C74293d1 c74293d1 = this.A1x;
            c74293d1.A06.A00(c74293d1.A05);
            c74293d1.A01.A01(c74293d1.A00);
            c74293d1.A0A.A01(c74293d1.A09);
            this.A1N.A00(this.A1M);
            ScheduledExecutorService scheduledExecutorService = this.A0s;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdown();
                this.A0s = null;
            }
            Integer num = this.A0c;
            if (num != null && (intValue = num.intValue()) != 0) {
                C000200d.A0g(this.A1a, "call_offer_ack_timeout", intValue * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
            } else {
                C000200d.A0f(this.A1a, "call_offer_ack_timeout");
            }
            StringBuilder A0P = C000200d.A0P("voip/service/destroyed pendingCommands: ");
            List<Object> list = this.A28;
            A0P.append(list.size());
            Log.i(A0P.toString());
            for (Object obj : list) {
                this.A22.A00.obtainMessage(1, obj).sendToTarget();
            }
            list.clear();
            if (Build.VERSION.SDK_INT >= 28 && this.A0W != null) {
                C459824m c459824m = this.A1z;
                AnonymousClass257 A03 = c459824m.A03();
                C000700j.A01();
                C000700j.A08(A03.A05.size() == 0, "Self managed connections are not disconnected when VoiceService is being destroyed");
                AnonymousClass257 A032 = c459824m.A03();
                C000700j.A01();
                ConcurrentMap concurrentMap = A032.A05;
                if (!concurrentMap.isEmpty()) {
                    Log.i("voip/SelfManagedConnectionsManager/removeAllConnections");
                    Iterator it = new ArrayList(concurrentMap.values()).iterator();
                    while (it.hasNext()) {
                        ((C74403dD) it.next()).A00(2);
                    }
                    C000700j.A08(concurrentMap.isEmpty(), "all connection should have been removed");
                }
                c459824m.A03().A00(this.A0W);
                this.A0W = null;
            }
            this.A1R.A0i.remove(this.A0Q);
            if (!this.A12 || Build.VERSION.SDK_INT < 28) {
                return;
            }
            for (StatusBarNotification statusBarNotification : this.A1m.A0H()) {
                if (statusBarNotification.getId() == 23) {
                    this.A1I.A09("VoiceService/onDestroy", "voip/orphannotification", true);
                }
            }
            return;
        }
        throw null;
    }

    public void A0H() {
        long j = this.A0B;
        if (j != -1) {
            this.A0D = (System.currentTimeMillis() - j) + this.A0D;
            this.A0B = -1L;
            Log.i("VoiceService:onExitPictureInPicture");
        }
    }

    public void A0I() {
        Log.i("voip/restoreProximitySensor");
        if (this.A0x) {
            this.A0x = false;
            this.A0K.removeMessages(14);
            this.A0K.sendEmptyMessage(14);
        }
    }

    public void A0J() {
        A0X();
        this.A27.setRequestedCamera2SupportLevel(this.A25.A05());
        this.A0K.removeMessages(23);
        this.A0K.sendEmptyMessageDelayed(23, 45000L);
        this.A0s.execute(RunnableC73703c4.A00);
    }

    public void A0K() {
        if (this.A1E != null) {
            Log.i("voip/vibrate/stop");
            Vibrator vibrator = (Vibrator) this.A1F.getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.cancel();
                this.A1E = null;
            } else {
                throw null;
            }
        }
        this.A0I = null;
        C84613u2 c84613u2 = this.A0U;
        if (c84613u2 != null) {
            c84613u2.A05(true);
            this.A0U = null;
        }
        if (this.A0G != null) {
            Log.i("voip/ringtone/stop");
            this.A0G.stop();
            this.A0G = null;
        }
    }

    public void A0L() {
        C74613dY c74613dY = this.A23;
        c74613dY.A04(!(c74613dY.A00 == 3), Voip.getCallInfo());
    }

    public void A0M() {
        C74613dY c74613dY = this.A23;
        boolean z = c74613dY.A00 != 1;
        CallInfo callInfo = Voip.getCallInfo();
        if (z && c74613dY.A00 == 3 && !c74613dY.A07) {
            c74613dY.A04(false, callInfo);
        }
        c74613dY.A05(z, callInfo);
    }

    public void A0N() {
        this.A0s.execute(RunnableC73503bk.A00);
    }

    public void A0O() {
        this.A0s.execute(RunnableC73483bi.A00);
    }

    public final void A0P() {
        this.A0M.removeMessages(0);
        this.A0M.sendEmptyMessageDelayed(0, 15000L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.3u2, X.0HS] */
    public final void A0Q() {
        if (this.A0I != null) {
            Ringtone ringtone = this.A0G;
            if (ringtone == null) {
                if (this.A0U == null) {
                    ?? r3 = new C0HS(this.A1F, this.A1s) { // from class: X.3u2
                        public final WeakReference A00;
                        public final WeakReference A01;

                        {
                            this.A01 = new WeakReference(r3);
                            this.A00 = new WeakReference(r2);
                        }

                        @Override // X.C0HS
                        public Object A07(Object[] objArr) {
                            Uri uri;
                            Context context;
                            Uri[] uriArr = (Uri[]) objArr;
                            if (uriArr.length <= 0 || (uri = uriArr[0]) == null || (context = (Context) this.A00.get()) == null) {
                                return null;
                            }
                            return RingtoneManager.getRingtone(context, uri);
                        }

                        @Override // X.C0HS
                        public void A09(Object obj) {
                            Ringtone ringtone2 = (Ringtone) obj;
                            C25L c25l = ((C84303tW) this.A01.get()).A00;
                            CallInfo callInfo = Voip.getCallInfo();
                            if (callInfo != null && callInfo.callState == Voip.CallState.RECEIVED_CALL && c25l.A0I != null) {
                                Ringtone ringtone3 = c25l.A0G;
                                if (ringtone3 != null) {
                                    ringtone3.stop();
                                }
                                c25l.A0G = ringtone2;
                                if (ringtone2 != null) {
                                    try {
                                        ringtone2.play();
                                        return;
                                    } catch (Exception e) {
                                        Log.e(e);
                                        try {
                                            c25l.A0G.stop();
                                        } catch (Exception e2) {
                                            Log.e(e2);
                                        }
                                        c25l.A0G = null;
                                        return;
                                    }
                                }
                                StringBuilder A0P = C000200d.A0P("voip/ringtone/no-ringtone found for ");
                                A0P.append(c25l.A0I);
                                Log.e(A0P.toString());
                            }
                        }
                    };
                    this.A0U = r3;
                    this.A1r.ARy(r3, this.A0I);
                    return;
                }
                return;
            }
            try {
                if (ringtone.isPlaying()) {
                    return;
                }
                this.A0G.play();
            } catch (NullPointerException e) {
                if (Build.VERSION.SDK_INT == 22 && "oppo".equalsIgnoreCase(Build.MANUFACTURER)) {
                    Log.e("voip/loadAndPlayRingtone error while playing existing ringtone", e);
                    return;
                }
                throw e;
            }
        }
    }

    public final void A0R() {
        C0MS c0ms;
        Log.i("voip/ear-far");
        C000700j.A01();
        this.A0y = false;
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo != null && callInfo.isEitherSideRequestingUpgrade()) {
            C0MS c0ms2 = this.A0Z;
            if (c0ms2 != null) {
                ((VoipActivityV2) c0ms2).A2B(callInfo);
            }
            this.A23.A01(callInfo);
        }
        if ((this.A0O == null || Build.VERSION.SDK_INT < 21) && (c0ms = this.A0Z) != null) {
            ((VoipActivityV2) c0ms).A2T(false);
        }
    }

    public final void A0S() {
        C0MS c0ms;
        Log.i("voip/ear-near");
        C000700j.A01();
        this.A0y = true;
        CallInfo callInfo = Voip.getCallInfo();
        if (this.A1B || (callInfo != null && callInfo.isEitherSideRequestingUpgrade())) {
            if (A0x()) {
                this.A23.A05(false, callInfo);
            }
            this.A1B = false;
        }
        if ((this.A0O == null || Build.VERSION.SDK_INT < 21) && (c0ms = this.A0Z) != null) {
            ((VoipActivityV2) c0ms).A2T(true);
        }
    }

    public final void A0T() {
        Object obj = this.A0n;
        if (obj != null) {
            try {
                ((AcousticEchoCanceler) obj).release();
            } catch (Throwable th) {
                Log.e(th);
            }
        }
        this.A0n = null;
        Object obj2 = this.A0o;
        if (obj2 != null) {
            try {
                ((AutomaticGainControl) obj2).release();
            } catch (Throwable th2) {
                Log.e(th2);
            }
        }
        this.A0o = null;
        Object obj3 = this.A0p;
        if (obj3 != null) {
            try {
                ((NoiseSuppressor) obj3).release();
            } catch (Throwable th3) {
                Log.e(th3);
            }
        }
        this.A0p = null;
    }

    public final void A0U() {
        C000700j.A01();
        try {
            if (this.A0O != null) {
                Log.i("voip/service/releaseProximityWakeLock");
                this.A0O.release();
                this.A0O = null;
            }
        } catch (Exception e) {
            Log.e(e);
            this.A0O = null;
        }
        C72603aI c72603aI = this.A0S;
        SensorEventListener sensorEventListener = c72603aI.A00;
        if (sensorEventListener != null) {
            c72603aI.A02.unregisterListener(sensorEventListener, c72603aI.A01);
            c72603aI.A00 = null;
        }
        if (0 != 0) {
            C72593aH c72593aH = new C72593aH(c72603aI, null);
            c72603aI.A00 = c72593aH;
            c72603aI.A02.registerListener(c72593aH, c72603aI.A01, 2);
        }
        this.A0y = false;
    }

    public final void A0V() {
        A0U();
        C000700j.A01();
        try {
            if (this.A0N != null) {
                Log.i("voip/service/releasePartialWakeLock");
                this.A0N.release();
                this.A0N = null;
            }
        } catch (Exception e) {
            Log.e(e);
            this.A0N = null;
        }
    }

    public final void A0W() {
        StringBuilder sb = new StringBuilder("voip/service/resetAudioManager ");
        sb.append(this);
        Log.i(sb.toString());
        C74613dY c74613dY = this.A23;
        AudioManager A0A = c74613dY.A0A.A0A();
        if (A0A != null) {
            A0A.setSpeakerphoneOn(false);
        }
        c74613dY.A04(false, null);
        c74613dY.A00 = 2;
        AudioManager A0A2 = this.A1X.A0A();
        if (A0A2 != null) {
            try {
                A0A2.setMode(0);
            } catch (Exception e) {
                Log.e(e);
            }
            A0A2.abandonAudioFocus((AudioManager.OnAudioFocusChangeListener) A2M);
        }
    }

    public final void A0X() {
        Point point = new Point();
        WindowManager windowManager = (WindowManager) this.A1F.getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getSize(point);
            Voip.setScreenSize(point.x, point.y);
            return;
        }
        throw null;
    }

    public void A0Y(int i) {
        this.A0s.execute(new RunnableEBaseShape0S0001000_I0(i, 0));
    }

    public void A0Z(int i) {
        this.A0s.execute(new RunnableEBaseShape0S0001000_I0(i, 1));
    }

    public void A0a(int i, String str) {
        Bundle A01 = C000200d.A01("end_call_reason", i);
        if (str != null) {
            A01.putString("end_call_string", str);
        }
        C41641uH c41641uH = this.A22;
        c41641uH.A00.obtainMessage(1, new C49032Ic("hangup_call", A01, null)).sendToTarget();
    }

    public final void A0b(int i, String str) {
        C0MS c0ms;
        C00R c00r = (C00R) this.A1i;
        if (c00r.A03.A01()) {
            for (C07G c07g : c00r.A04.A00()) {
                c07g.A03(i);
            }
        }
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo == null) {
            Log.i("voip/call/end without call info");
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C000700j.A01();
        if (i == 25 || i == 24) {
            str = null;
        } else {
            if (TextUtils.isEmpty(str) && callInfo.isCaller && callInfo.callState == Voip.CallState.CALLING && !this.A0v && SystemClock.elapsedRealtime() - this.A08 > 10000) {
                str = this.A1b.A06(R.string.voip_call_failed_no_network);
            } else if (TextUtils.isEmpty(str) && i == 27) {
                if (callInfo.callDuration > 0) {
                    str = this.A1b.A06(R.string.voip_call_during_call_error);
                } else {
                    str = this.A1b.A06(R.string.voip_call_setup_error);
                }
            }
            if (str != null && (c0ms = this.A0Z) != null) {
                ((VoipActivityV2) c0ms).A1P = str;
                this.A2J = -1;
            }
        }
        if (callInfo.isCaller && callInfo.callState == Voip.CallState.CALLING && this.A2L) {
            this.A2G = 14;
        } else {
            this.A2G = i;
        }
        C000200d.A1F(C000200d.A0W("voip/call/end without text=", str, ", reason code="), this.A2G);
        Future future = this.A1x.A0F;
        if (future != null) {
            future.cancel(true);
        }
        this.A0s.execute(new RunnableEBaseShape0S0101000_I0(this, i, 12));
        StringBuilder sb = new StringBuilder("voip/call/end elapsed ");
        sb.append(SystemClock.elapsedRealtime() - elapsedRealtime);
        sb.append(" ms");
        Log.i(sb.toString());
    }

    public void A0c(long j) {
        C000200d.A0u("VoiceService/delayShowingIncomingCall delay = ", j);
        this.A0K.removeMessages(1);
        this.A0K.sendEmptyMessageDelayed(1, j);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:1|(1:3)(1:(1:46))|4|(1:6)|7|(1:9)(2:41|(1:43)(1:44))|10|11|12|13|14|15|16|(2:18|(8:20|(1:22)(1:33)|(1:24)|25|26|27|28|29))|34|(0)|25|26|27|28|29) */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00e3, code lost:
        r9.numberOfProcessors = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0d(com.whatsapp.fieldstats.events.WamCall r9, com.whatsapp.jid.UserJid r10, java.lang.Long r11, java.lang.Integer r12, java.lang.Integer r13, java.lang.Integer r14, java.lang.String r15, java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25L.A0d(com.whatsapp.fieldstats.events.WamCall, com.whatsapp.jid.UserJid, java.lang.Long, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String):void");
    }

    public final void A0e(Jid jid, String str, boolean z) {
        if (str != null) {
            StringBuilder sb = new StringBuilder("voip/sendPendingCallOfferStanza jid=");
            sb.append(jid);
            sb.append(" callId=");
            sb.append(str);
            sb.append(" callTerminated=");
            sb.append(z);
            sb.append(" pendingCallOfferStanza=(");
            sb.append(this.A2H);
            sb.append("), this = ");
            sb.append(this);
            Log.i(sb.toString());
        }
        C40591sW c40591sW = this.A2H;
        if (c40591sW != null) {
            String str2 = c40591sW.A04;
            if (str2.equals(str)) {
                Jid jid2 = c40591sW.A01;
                if (jid2 instanceof DeviceJid) {
                    jid2 = ((DeviceJid) jid2).userJid;
                }
                if (jid instanceof DeviceJid) {
                    jid = ((DeviceJid) jid).userJid;
                }
                if (jid2.equals(jid)) {
                    if (z) {
                        c40591sW = new C40591sW(jid2, str2, AnonymousClass029.A0M(c40591sW, null), null);
                    }
                    this.A2H = null;
                    A0l(c40591sW);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0f(com.whatsapp.jid.UserJid r8, long[] r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25L.A0f(com.whatsapp.jid.UserJid, long[], boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0008, code lost:
        if (r6.A0y != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x007f A[Catch: Exception -> 0x0098, TryCatch #2 {Exception -> 0x0098, blocks: (B:88:0x004c, B:97:0x0071, B:99:0x0079, B:100:0x007f, B:103:0x0085, B:105:0x008f, B:91:0x0056, B:93:0x0064, B:95:0x006b), top: B:115:0x004c, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0079 A[Catch: Exception -> 0x0098, TryCatch #2 {Exception -> 0x0098, blocks: (B:88:0x004c, B:97:0x0071, B:99:0x0079, B:100:0x007f, B:103:0x0085, B:105:0x008f, B:91:0x0056, B:93:0x0064, B:95:0x006b), top: B:115:0x004c, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0g(com.whatsapp.voipcalling.CallInfo r7) {
        /*
            r6 = this;
            boolean r0 = r6.A0x
            r3 = 0
            if (r0 == 0) goto La
            boolean r0 = r6.A0y
            r2 = 1
            if (r0 == 0) goto Lb
        La:
            r2 = 0
        Lb:
            r6.A0x = r2
            X.3dY r0 = r6.A23
            int r1 = r0.A00
            r0 = 2
            if (r1 != r0) goto L2f
            boolean r0 = X.AnonymousClass029.A1W(r7)
            if (r0 != 0) goto L2f
            if (r2 != 0) goto L2f
            boolean r0 = r7.isCaller
            if (r0 != 0) goto L28
            com.whatsapp.voipcalling.Voip$CallState r0 = r7.callState
            boolean r0 = com.whatsapp.voipcalling.Voip.A0B(r0)
            if (r0 != 0) goto L2f
        L28:
            boolean r0 = r7.isSelfRequestingUpgrade()
            if (r0 != 0) goto L2f
            r3 = 1
        L2f:
            boolean r0 = r7.isPeerRequestingUpgrade()
            if (r0 != 0) goto L44
            boolean r0 = r6.A1B
            if (r0 != 0) goto L44
            if (r3 != 0) goto L44
            r6.A0U()
            java.lang.String r0 = "voip/adjustProximitySensor: off"
            com.whatsapp.util.Log.i(r0)
            return
        L44:
            X.C000700j.A01()
            android.os.PowerManager$WakeLock r0 = r6.A0O
            if (r0 != 0) goto Lc1
            r2 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L98
            r0 = 21
            r4 = -1
            if (r1 < r0) goto L56
            r3 = 32
            goto L71
        L56:
            java.lang.Class<android.os.PowerManager> r1 = android.os.PowerManager.class
            java.lang.String r0 = "PROXIMITY_SCREEN_OFF_WAKE_LOCK"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch: java.lang.IllegalAccessException -> L63 java.lang.NoSuchFieldException -> L6a java.lang.Exception -> L98
            int r3 = r0.getInt(r2)     // Catch: java.lang.IllegalAccessException -> L63 java.lang.NoSuchFieldException -> L6a java.lang.Exception -> L98
            goto L71
        L63:
            r1 = move-exception
            java.lang.String r0 = "unable to access PROXIMITY_SCREEN_OFF_WAKE_LOCK field in PowerManager"
            com.whatsapp.util.Log.w(r0, r1)     // Catch: java.lang.Exception -> L98
            goto L70
        L6a:
            r1 = move-exception
            java.lang.String r0 = "no PROXIMITY_SCREEN_OFF_WAKE_LOCK field in PowerManager"
            com.whatsapp.util.Log.w(r0, r1)     // Catch: java.lang.Exception -> L98
        L70:
            r3 = -1
        L71:
            X.02E r0 = r6.A1X     // Catch: java.lang.Exception -> L98
            android.os.PowerManager r1 = r0.A0D()     // Catch: java.lang.Exception -> L98
            if (r1 != 0) goto L7f
            java.lang.String r0 = "voip/service/acquireProximityWakeLock pm=null"
            com.whatsapp.util.Log.w(r0)     // Catch: java.lang.Exception -> L98
            goto L9e
        L7f:
            android.os.PowerManager$WakeLock r0 = r6.A0O     // Catch: java.lang.Exception -> L98
            if (r0 != 0) goto L9e
            if (r3 == r4) goto L9e
            java.lang.String r0 = "VoiceService Proximity"
            android.os.PowerManager$WakeLock r0 = X.C02180Ae.A0R(r1, r3, r0)     // Catch: java.lang.Exception -> L98
            r6.A0O = r0     // Catch: java.lang.Exception -> L98
            if (r0 == 0) goto L9e
            r0.acquire()     // Catch: java.lang.Exception -> L98
            java.lang.String r0 = "voip/service/acquireProximityWakeLock acquired"
            com.whatsapp.util.Log.i(r0)     // Catch: java.lang.Exception -> L98
            goto L9e
        L98:
            r0 = move-exception
            com.whatsapp.util.Log.e(r0)
            r6.A0O = r2
        L9e:
            X.3aI r5 = r6.A0S
            X.3tX r4 = r6.A0T
            android.hardware.SensorEventListener r2 = r5.A00
            if (r2 == 0) goto Lb0
            android.hardware.SensorManager r1 = r5.A02
            android.hardware.Sensor r0 = r5.A01
            r1.unregisterListener(r2, r0)
            r0 = 0
            r5.A00 = r0
        Lb0:
            if (r4 == 0) goto Lc1
            X.3aH r3 = new X.3aH
            r3.<init>(r5, r4)
            r5.A00 = r3
            android.hardware.SensorManager r2 = r5.A02
            android.hardware.Sensor r1 = r5.A01
            r0 = 2
            r2.registerListener(r3, r1, r0)
        Lc1:
            java.lang.String r0 = "voip/adjustProximitySensor: on"
            com.whatsapp.util.Log.i(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25L.A0g(com.whatsapp.voipcalling.CallInfo):void");
    }

    public final void A0h(CallInfo callInfo, int i, boolean z) {
        C000700j.A01();
        if (callInfo != null && !callInfo.callEnding) {
            C2U6 A00 = C2U6.A00(callInfo, this.A14);
            C50792Te c50792Te = this.A1u;
            Context context = this.A1F;
            C41641uH c41641uH = this.A22;
            Notification A02 = c50792Te.A02(context, i, A00, c41641uH);
            if (this.A12) {
                Log.i("VoiceService/startForegroundService Background restrictions on");
                this.A1Z.A03(null, 23, A02);
                return;
            }
            synchronized (this) {
                Application application = c41641uH.A0N.A00;
                C0ER c0er = c41641uH.A0i;
                StringBuilder sb = new StringBuilder("voicefgservice/start-service notifcation:");
                sb.append(A02);
                Log.i(sb.toString());
                Intent putExtra = new Intent("com.whatsapp.service.VoiceFgService.START").putExtra("com.whatsapp.service.VoiceFgService.EXTRA_NOTIFICATION_ID", 23).putExtra("com.whatsapp.service.VoiceFgService.EXTRA_STOP_FOREGROUND_STATE", z);
                VoiceFGService.A01 = A02;
                c0er.A03(application, VoiceFGService.class, putExtra);
                this.A0z = true;
            }
            return;
        }
        Log.e("do not create notification, we are not in a active call");
    }

    public final void A0i(CallInfo callInfo, boolean z) {
        String obj;
        Voip.CallState callState;
        C000700j.A01();
        StringBuilder sb = new StringBuilder("voip/phone-call-in-progress-changed: ");
        sb.append(z);
        if (callInfo == null) {
            obj = null;
        } else {
            StringBuilder A0P = C000200d.A0P(", call state: ");
            A0P.append(callInfo.callState);
            obj = A0P.toString();
        }
        C000200d.A1N(sb, obj);
        if (callInfo == null || (callState = callInfo.callState) == Voip.CallState.NONE) {
            return;
        }
        if (z) {
            if (callState != Voip.CallState.CALLING && callState != Voip.CallState.PRE_ACCEPT_RECEIVED && callState != Voip.CallState.RECEIVED_CALL && callState != Voip.CallState.REJOINING) {
                this.A23.A02(callInfo);
            } else {
                A0a(4, null);
                return;
            }
        } else {
            this.A23.A01(callInfo);
        }
        Voip.onCallInterrupted(z, !A13(callInfo.callId));
    }

    public final void A0j(C0D3 c0d3, boolean z) {
        C0HY c0hy = this.A1e;
        C05M c05m = c0hy.A09;
        UserJid userJid = c0d3.A09.A01;
        if (c05m.A07(userJid) != null) {
            c0hy.A0A.A0Q(new C04280Jo(C05V.A00(c0hy.A04, c0hy.A02, userJid, false), c0d3));
        }
        C05480Ox c05480Ox = this.A1v;
        if (c05480Ox != null) {
            Log.i("voip/notifyCallMissed");
            C000700j.A01();
            Iterator it = c05480Ox.A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (!c0g5.hasNext()) {
                    return;
                }
                ((C05490Oy) c0g5.next()).A05(c0d3, z);
            }
        } else {
            throw null;
        }
    }

    public final void A0k(C0D3 c0d3, boolean z) {
        synchronized (c0d3) {
            if (c0d3.A0D != z) {
                c0d3.A0F = true;
            }
            c0d3.A0D = z;
        }
        String A0s = AnonymousClass029.A0s(c0d3.A03().A02);
        StringBuilder sb = new StringBuilder("voip/setCallLogIsJoinableGroupCall callId:");
        sb.append(A0s);
        sb.append(" joinable:");
        sb.append(z);
        Log.i(sb.toString());
        if (z) {
            C000700j.A08(c0d3.A04 != null, "Can't rejoin from call logs missing call creator");
            this.A25.A09(A0s, c0d3.A02());
            this.A20.A03(c0d3);
            return;
        }
        C49762Mg c49762Mg = this.A20;
        c49762Mg.A02();
        synchronized (c49762Mg) {
            c49762Mg.A00.remove(c0d3.A09.A02);
        }
        c49762Mg.A01.A02.post(new RunnableEBaseShape7S0100000_I0_7(c49762Mg.A04, 48));
        C0EW c0ew = this.A25;
        SharedPreferences.Editor A03 = c0ew.A03();
        StringBuilder sb2 = new StringBuilder("joinable_");
        sb2.append(A0s);
        A03.remove(sb2.toString()).apply();
        SharedPreferences.Editor A032 = c0ew.A03();
        StringBuilder sb3 = new StringBuilder("active_joinable_call");
        sb3.append(A0s);
        A032.remove(sb3.toString()).apply();
    }

    public final void A0l(C40591sW c40591sW) {
        Jid jid = c40591sW.A01;
        String str = c40591sW.A04;
        VoipStanzaChildNode voipStanzaChildNode = c40591sW.A03;
        String str2 = c40591sW.A05;
        boolean z = !TextUtils.isEmpty(str2);
        if (!z) {
            str2 = C05V.A02(this.A1Y, this.A1L, false);
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : c40591sW.A06.entrySet()) {
            Object key = entry.getKey();
            if (entry.getValue() != null) {
                hashMap.put(key, entry.getValue());
            }
        }
        Set keySet = hashMap.keySet();
        boolean z2 = !keySet.isEmpty();
        if (z2) {
            for (Object obj : keySet) {
                if (this.A1x.A0E.contains(obj)) {
                    StringBuilder sb = new StringBuilder("VoiceService:sendOfferStanza waiting for PreKey job finishes with ");
                    sb.append(obj);
                    Log.i(sb.toString());
                    this.A2H = c40591sW;
                    return;
                }
            }
        }
        RunnableC73833cH runnableC73833cH = new RunnableC73833cH(this, z2, jid, str, hashMap, c40591sW, voipStanzaChildNode, str2, z);
        if (z2) {
            this.A02 = this.A25.A04().getInt("call_start_delay", 0);
            CallInfo callInfo = Voip.getCallInfo();
            int i = this.A02;
            if (i > 0 && i < 3000 && callInfo != null && callInfo.callState == Voip.CallState.CALLING && c40591sW.A00 == 0) {
                StringBuilder A0P = C000200d.A0P("VoiceService:sendOfferStanza with ");
                A0P.append(i);
                A0P.append(" ms delay");
                Log.i(A0P.toString());
                this.A2L = true;
                this.A0s.schedule(runnableC73833cH, this.A02, TimeUnit.MILLISECONDS);
                return;
            }
            Log.i("VoiceService:sendOfferStanza without delay");
            this.A0s.execute(runnableC73833cH);
            return;
        }
        runnableC73833cH.run();
    }

    /* JADX WARN: Code restructure failed: missing block: B:192:0x00be, code lost:
        if (r1.equals("hangup_call") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x00d4, code lost:
        if (r1.equals("start_web_relay") != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0131, code lost:
        if (r1.equals("receive_message") != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x018b, code lost:
        if (r1.equals("refresh_notification") != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x01a0, code lost:
        if (r1.equals("start_from_call_log") != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x01f2, code lost:
        if (r1.equals("check_ongoing_calls") != false) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:180:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:299:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0m(X.C49032Ic r23) {
        /*
            Method dump skipped, instructions count: 936
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25L.A0m(X.2Ic):void");
    }

    public void A0n(Voip.CallState callState) {
        int i;
        AudioManager A0A = this.A1X.A0A();
        int ordinal = callState.ordinal();
        if ((ordinal != 1 && ordinal != 2 && ordinal != 4 && ordinal != 5 && ordinal != 6) || A0A == null || A13(Voip.getCurrentCallId())) {
            return;
        }
        int mode = A0A.getMode();
        Integer num = this.A0a;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 3;
        }
        if (mode != i) {
            A0A.setMode(i);
        }
        StringBuilder sb = new StringBuilder("voip/updateAudioModeForCallState ");
        sb.append(callState);
        sb.append(" to ");
        sb.append(i);
        Log.i(sb.toString());
    }

    public final void A0o(Voip.CallState callState, CallInfo callInfo) {
        PowerManager.WakeLock A0R;
        StringBuilder sb = new StringBuilder("voip/service/stop ");
        sb.append(this);
        Log.i(sb.toString());
        C000700j.A01();
        synchronized (this) {
            if (this.A0z) {
                C41641uH c41641uH = this.A22;
                Application application = c41641uH.A0N.A00;
                C0ER c0er = c41641uH.A0i;
                Log.i("voicefgservice/stop-service");
                c0er.A02(application, VoiceFGService.class);
                this.A0z = false;
            } else if (this.A12) {
                Log.i("VoiceService/stopForegroundService Background restriction on");
                this.A1Z.A05(null, 23);
            }
        }
        if (this.A19) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.A19 = false;
            this.A0C = 0L;
            this.A0k = null;
            this.A0u = false;
            this.A0y = false;
            this.A14 = false;
            this.A2J = null;
            this.A2K = null;
            this.A0R = null;
            this.A0a = null;
            this.A0e = 1500;
            this.A0I = null;
            this.A0d = null;
            this.A0b = null;
            this.A0j = null;
            this.A0w = false;
            this.A09 = 0L;
            this.A0Y = null;
            this.A0X = null;
            this.A0r = null;
            this.A0q = null;
            this.A1C = true;
            this.A0h = null;
            this.A0f = null;
            this.A0v = false;
            this.A08 = 0L;
            this.A11 = false;
            this.A0t = (short) 0;
            this.A07 = 0;
            this.A18 = false;
            this.A2G = 0;
            this.A2H = null;
            this.A2B.clear();
            this.A2C.clear();
            this.A1x.A0E.clear();
            this.A2A.clear();
            this.A16 = false;
            this.A0x = false;
            this.A05 = 30;
            this.A02 = 0;
            this.A2L = false;
            C74203cs c74203cs = this.A1t;
            c74203cs.A02 = 0L;
            c74203cs.A01 = Double.NaN;
            c74203cs.A00 = Double.NaN;
            this.A0D = 0L;
            this.A0B = -1L;
            this.A03 = 0;
            this.A0l = null;
            this.A10 = false;
            this.A0g = null;
            this.A0A = 0L;
            TelephonyManager telephonyManager = this.A1G;
            if (telephonyManager == null) {
                Log.w("voip/service/stop telephonyManager=null");
            } else {
                telephonyManager.listen(this.A0P, 0);
            }
            Context context = this.A1F;
            context.unregisterReceiver(this.A0E);
            C74613dY c74613dY = this.A23;
            if (c74613dY != null) {
                C000200d.A1V(C000200d.A0P("voip/audio_route/onCallStop using telecom:"), c74613dY.A07);
                if (!c74613dY.A07) {
                    c74613dY.A0B.A01();
                    Context context2 = c74613dY.A09;
                    context2.unregisterReceiver(c74613dY.A0F);
                    context2.unregisterReceiver(c74613dY.A0H);
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    context.unregisterReceiver(this.A0F);
                }
                A0R();
                A0V();
                try {
                    PowerManager A0D = this.A1X.A0D();
                    if (A0D == null) {
                        Log.w("voice/service/turn-on-screen pm=null");
                    } else if (!A0D.isScreenOn() && (A0R = C02180Ae.A0R(A0D, 268435466, "VoiceService end call")) != null) {
                        A0R.acquire(1L);
                        A0R.release();
                    }
                } catch (Exception e) {
                    Log.e(e);
                }
                A0K();
                if (this.A0H != null && callState == Voip.CallState.ACTIVE && callInfo != null && callInfo.callWaitingInfo.A01 == 0) {
                    MediaPlayer create = MediaPlayer.create(context, (int) R.raw.end_call);
                    int duration = create == null ? 500 : create.getDuration();
                    C000200d.A0q("voip/service/playEndCallTone duration: ", duration);
                    float f = c74613dY.A00 == 2 ? 1.0f : 0.5f;
                    Integer num = this.A0i;
                    if (num != null) {
                        this.A0H.play(num.intValue(), f, f, 0, 0, 1.0f);
                    } else {
                        Log.e("VoiceService:playEndCallTone sound pool has not been loaded successfully");
                    }
                    this.A0M.removeMessages(1);
                    this.A0M.sendEmptyMessageDelayed(1, duration + 100);
                } else {
                    A0W();
                }
                this.A0L.removeCallbacksAndMessages(null);
                C000500h c000500h = this.A1a;
                C000200d.A0f(c000500h, "voip_call_id");
                c000500h.A0D().remove("voip_call_ab_test_bucket").apply();
                A0P();
                StringBuilder sb2 = new StringBuilder("voip/service/stop elapsed ");
                sb2.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                sb2.append(" ms");
                Log.i(sb2.toString());
                if (4 <= Log.level) {
                    StringBuilder A0V = C000200d.A0V("voip/service/stop", "/total threads count = ");
                    A0V.append(Thread.activeCount());
                    Log.log(4, A0V.toString());
                }
                if (this.A13) {
                    this.A1S.A01(4, false);
                    return;
                } else {
                    this.A1S.A01(3, false);
                    return;
                }
            }
            throw null;
        }
    }

    public void A0p(C0MS c0ms) {
        StringBuilder sb = new StringBuilder("voip/service/resetVoipUiIfEquals ");
        sb.append(this);
        Log.i(sb.toString());
        if (this.A0Z == c0ms) {
            this.A0Z = null;
        }
    }

    public final void A0q(String str) {
        if (str != null && !str.equals(Voip.getCurrentCallId())) {
            Voip.clearVoipParam(str);
        } else {
            A0a(13, this.A1b.A06(R.string.voip_call_failed_no_network));
        }
    }

    public void A0r(String str, int i) {
        CallInfo callInfo = Voip.getCallInfo();
        if (!Voip.A09(callInfo)) {
            Log.w("voip/service/acceptCall No active call");
            return;
        }
        boolean equals = str.equals(callInfo.callWaitingInfo.A04);
        if (i != 0) {
            A0C(str).A00 = Integer.valueOf(i);
        }
        if (!equals) {
            this.A0u = true;
            A0K();
            if (A0x()) {
                this.A23.A05(false, callInfo);
            }
            A0n(Voip.CallState.ACCEPT_SENT);
        }
        this.A0s.schedule(new RunnableEBaseShape0S1110000_I0(this, str, equals, 1), 100L, TimeUnit.MILLISECONDS);
    }

    public final void A0s(String str, DeviceJid deviceJid, String str2, VoipStanzaChildNode voipStanzaChildNode, boolean z) {
        C010805j c010805j;
        VoipStanzaChildNode A0K = AnonymousClass029.A0K(voipStanzaChildNode, "enc");
        if (A0K == null) {
            C000700j.A08(false, "invalid enc node!");
            return;
        }
        Byte A0P = AnonymousClass029.A0P(A0K);
        if (A0P == null) {
            C000700j.A08(false, "invalid retry count!");
            return;
        }
        byte[] dataCopy = A0K.getDataCopy();
        if (dataCopy == null) {
            Log.e("VoiceService:sendReKeyStanza, e2e key is empty");
            C000700j.A08(false, "e2e key is empty!");
            return;
        }
        byte byteValue = A0P.byteValue();
        Map map = this.A2C;
        map.put(deviceJid, Byte.valueOf(byteValue));
        HashMap hashMap = new HashMap();
        hashMap.put(deviceJid, dataCopy);
        Map A0E = A0E(hashMap);
        if (A0E != null && (c010805j = (C010805j) A0E.get(deviceJid)) != null) {
            if (!str2.equals(Voip.getCurrentCallId())) {
                StringBuilder sb = new StringBuilder("VoiceService:rekeyEncryptionTask(");
                sb.append(str2);
                sb.append(", ");
                sb.append(deviceJid);
                sb.append(", the call has ended, do nothing)");
                Log.w(sb.toString());
                return;
            }
            map.remove(deviceJid);
            this.A1w.A00(new C04990Mu(str, deviceJid, str2, AnonymousClass029.A0J(voipStanzaChildNode, c010805j, byteValue), z));
        }
    }

    public final void A0t(String str, C0D3 c0d3, int i, long j, Integer num, String str2, String str3, boolean z, CallGroupInfo callGroupInfo, boolean z2, boolean z3, boolean z4, boolean z5) {
        int i2;
        CallParticipant[] callParticipantArr;
        int length;
        C07950aM c07950aM = c0d3.A09;
        C000700j.A08(!c07950aM.A03, "processMissedIncomingCall should only be called on callee side");
        Voip.A01.A01(str);
        String voipParamForCall = Voip.getVoipParamForCall("test.name", str);
        voipParamForCall = (voipParamForCall == null || voipParamForCall.isEmpty()) ? null : null;
        Voip.clearVoipParam(str);
        c0d3.A06(2);
        if (callGroupInfo == null || (length = (callParticipantArr = callGroupInfo.participants).length) <= 0) {
            i2 = 0;
        } else {
            i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                CallParticipant callParticipant = callParticipantArr[i3];
                if ("connected".equals(callParticipant.state)) {
                    c0d3.A0C(callParticipant.jid, 5);
                    i2++;
                }
            }
        }
        this.A1e.A08(c0d3);
        if (!z4) {
            Message.obtain(this.A0K, 5, z2 ? 1 : 0, 0, c0d3).sendToTarget();
        }
        UserJid userJid = c07950aM.A01;
        C74553dS A0C = A0C(str);
        WamCall wamCall = new WamCall();
        Integer valueOf = Integer.valueOf(i);
        wamCall.callResult = valueOf;
        wamCall.callSide = 2;
        if (i2 > 0) {
            Boolean bool = Boolean.TRUE;
            wamCall.groupCallIsLastSegment = bool;
            wamCall.groupCallIsGroupCallInvitee = bool;
            wamCall.numConnectedParticipants = Long.valueOf(i2);
            wamCall.fieldStatsRowType = 2;
        } else {
            wamCall.callIsLastSegment = Boolean.TRUE;
        }
        Boolean valueOf2 = Boolean.valueOf(z3);
        wamCall.videoEnabled = valueOf2;
        wamCall.callTestBucket = voipParamForCall;
        wamCall.incomingCallUiAction = A0C.A00;
        if (this.A1y.getJoinableMilestoneVersion() >= 2) {
            wamCall.joinableNewUi = Boolean.TRUE;
        }
        if (z4) {
            wamCall.joinableDuringCall = Boolean.TRUE;
        }
        if (z5) {
            wamCall.isPendingCall = Boolean.TRUE;
        }
        A0d(wamCall, userJid, Long.valueOf(j), null, null, num, str2, str3);
        if (z4) {
            wamCall.callRandomId = A0D(str, C05V.A02(this.A1Y, this.A1L, true));
        }
        C0HA c0ha = this.A1h;
        c0ha.A06(wamCall, z);
        if (i2 > 0 && AnonymousClass029.A1O(this.A1O)) {
            WamJoinableCall wamJoinableCall = new WamJoinableCall();
            if (z4) {
                wamJoinableCall.callRandomId = wamCall.callRandomId;
            }
            if (A0C.A01) {
                wamJoinableCall.isRering = Boolean.TRUE;
            }
            if (z4) {
                wamJoinableCall.joinableDuringCall = Boolean.TRUE;
            }
            wamJoinableCall.numConnectedPeers = Long.valueOf(i2);
            wamJoinableCall.videoEnabled = valueOf2;
            wamJoinableCall.lobbyEntryPoint = 5;
            wamJoinableCall.lobbyExit = 6;
            wamJoinableCall.legacyCallResult = valueOf;
            if (z5) {
                wamJoinableCall.isPendingCall = Boolean.TRUE;
            }
            AnonymousClass011 anonymousClass011 = c0ha.A0B;
            anonymousClass011.A09(wamJoinableCall, 1);
            AnonymousClass011.A01(wamJoinableCall, "");
            if (z) {
                anonymousClass011.A03();
            }
        }
        this.A29.remove(str);
    }

    public void A0u(String str, String str2, int i) {
        Log.i("voip/call/reject");
        if (i != 0) {
            A0C(str).A00 = Integer.valueOf(i);
        }
        this.A0s.execute(new RunnableC73863cK(str, str2));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x00f2, code lost:
        if (r14 == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x027c, code lost:
        if (r10.equals(r19.A1b.A06(com.google.android.search.verification.client.R.string.settings_sound_silent)) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x02ee, code lost:
        if (r0 != 3) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x02f8, code lost:
        if (r1.equals("0") != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x02fa, code lost:
        com.whatsapp.util.Log.i("voip/ringtone/vibrate/off");
     */
    /* JADX WARN: Removed duplicated region for block: B:265:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0308  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0v(boolean r20, com.whatsapp.jid.UserJid r21, boolean r22, java.lang.String r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25L.A0v(boolean, com.whatsapp.jid.UserJid, boolean, java.lang.String, boolean):void");
    }

    public boolean A0w() {
        return this.A23.A06();
    }

    public boolean A0x() {
        return this.A23.A00 == 1;
    }

    public final boolean A0y() {
        PowerManager A0D = this.A1X.A0D();
        if (Build.VERSION.SDK_INT >= 21) {
            if (A0D == null) {
                Log.w("voip/service/start pm=null");
                return false;
            }
            return A0D.isPowerSaveMode();
        }
        return false;
    }

    public final boolean A0z() {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 28) {
            Boolean A00 = Voip.A00("options.android_telecom_framework_callee");
            if (A00 != null && A00.booleanValue()) {
                z = true;
            }
            this.A1z.A03().A06 = z;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:1036:0x074c, code lost:
        if (r0.isCaller != false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1392:0x0c8e, code lost:
        if (r7 != null) goto L679;
     */
    /* JADX WARN: Code restructure failed: missing block: B:768:0x0156, code lost:
        if (r0.isJoinableGroupCall == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:794:0x01cb, code lost:
        if (r1.A06((X.AbstractC005302j) r0) == false) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:800:0x01de, code lost:
        if (r14 == false) goto L266;
     */
    /* JADX WARN: Removed duplicated region for block: B:1148:0x08cd  */
    /* JADX WARN: Removed duplicated region for block: B:1334:0x0b97  */
    /* JADX WARN: Removed duplicated region for block: B:815:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:829:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:836:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:851:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:870:0x0394  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A10(android.os.Message r32) {
        /*
            Method dump skipped, instructions count: 3466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25L.A10(android.os.Message):boolean");
    }

    public final boolean A11(UserJid userJid, boolean z, String str) {
        C06C A0A = this.A1T.A0A(userJid);
        if (Build.VERSION.SDK_INT >= 28) {
            C459824m c459824m = this.A1z;
            Context context = this.A1F;
            C02L c02l = this.A1L;
            c02l.A05();
            UserJid userJid2 = c02l.A03;
            if (userJid2 != null) {
                if (c459824m.A07(context, userJid2)) {
                    String A08 = this.A1U.A08(A0A, false);
                    AnonymousClass257 A03 = c459824m.A03();
                    C000700j.A01();
                    StringBuilder sb = new StringBuilder("voip/SelfManagedConnectionsManager/addNewIncomingCall ");
                    sb.append(userJid);
                    Log.i(sb.toString());
                    if (!A03.A06) {
                        Log.w("voip/SelfManagedConnectionsManager/addNewIncomingCall incomingEnabled is false");
                        return false;
                    }
                    TelecomManager telecomManager = A03.A02;
                    if (telecomManager == null) {
                        Log.w("voip/SelfManagedConnectionsManager/addNewIncomingCall telecomManager is null");
                        return false;
                    }
                    PhoneAccountHandle phoneAccountHandle = A03.A00;
                    if (phoneAccountHandle == null) {
                        Log.w("voip/SelfManagedConnectionsManager/addNewIncomingCall phoneAccountHandle is null");
                        return false;
                    }
                    try {
                        if (!telecomManager.isIncomingCallPermitted(phoneAccountHandle)) {
                            Log.i("voip/SelfManagedConnectionsManager/addNewIncomingCall incoming call not permitted for the phone account handle");
                            return false;
                        }
                        Uri A00 = AnonymousClass257.A00(userJid);
                        if (A00 == null) {
                            return false;
                        }
                        Bundle A01 = AnonymousClass257.A01(str, userJid, A08, z, false);
                        A01.putParcelable("android.telecom.extra.INCOMING_CALL_ADDRESS", A00);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("voip/SelfManagedConnectionsManager/addNewIncomingCall ");
                        sb2.append(A01);
                        Log.i(sb2.toString());
                        try {
                            telecomManager.addNewIncomingCall(A03.A00, A01);
                            return true;
                        } catch (SecurityException e) {
                            Log.e(e);
                            return false;
                        }
                    } catch (Exception e2) {
                        Log.e(e2);
                        return false;
                    }
                }
                return false;
            }
            throw null;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x00e0, code lost:
        if (r19.A0u == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x005f, code lost:
        if (r1 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0068, code lost:
        if (r19.A1H.A00 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x008a, code lost:
        if (r5 == false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:93:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A12(com.whatsapp.voipcalling.CallInfo r20) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25L.A12(com.whatsapp.voipcalling.CallInfo):boolean");
    }

    public boolean A13(String str) {
        return A0B(str) != null;
    }
}

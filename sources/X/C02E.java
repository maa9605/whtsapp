package X;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.KeyguardManager;
import android.app.PendingIntent;
import android.app.usage.UsageStatsManager;
import android.content.ClipboardManager;
import android.content.ContentResolver;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Vibrator;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;

/* renamed from: X.02E */
/* loaded from: classes.dex */
public class C02E {
    public static volatile C02E A0I;
    public ActivityManager A00;
    public KeyguardManager A01;
    public AnonymousClass033 A02;
    public UsageStatsManager A03;
    public ClipboardManager A04;
    public ContentResolver A05;
    public SensorManager A06;
    public LocationManager A07;
    public ConnectivityManager A08;
    public WifiManager A09;
    public PowerManager A0A;
    public Vibrator A0B;
    public TelecomManager A0C;
    public SubscriptionManager A0D;
    public TelephonyManager A0E;
    public AccessibilityManager A0F;
    public InputMethodManager A0G;
    public final C001200o A0H;

    public C02E(C001200o c001200o) {
        this.A0H = c001200o;
    }

    public static C02E A00() {
        if (A0I == null) {
            synchronized (C02E.class) {
                if (A0I == null) {
                    A0I = new C02E(C001200o.A01);
                }
            }
        }
        return A0I;
    }

    public ActivityManager A01() {
        ActivityManager activityManager = this.A00;
        if (activityManager == null) {
            ActivityManager activityManager2 = (ActivityManager) this.A0H.A00.getSystemService("activity");
            this.A00 = activityManager2;
            return activityManager2;
        }
        return activityManager;
    }

    public AlarmManager A02() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23 && i < 26) {
            return A03();
        }
        return (AlarmManager) this.A0H.A00.getSystemService("alarm");
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [android.app.AlarmManager, X.033] */
    public final AlarmManager A03() {
        AnonymousClass033 anonymousClass033 = this.A02;
        if (anonymousClass033 == null) {
            ?? r1 = new AlarmManager((AlarmManager) this.A0H.A00.getSystemService("alarm")) { // from class: X.033
                public AlarmManager A00;

                {
                    this.A00 = r1;
                }

                public static boolean A00(Throwable th) {
                    String message;
                    if (th instanceof NullPointerException) {
                        return true;
                    }
                    return (th instanceof SecurityException) && (message = th.getMessage()) != null && message.contains("android.permission.GET_INTENT_SENDER_INTENT");
                }

                @Override // android.app.AlarmManager
                public void cancel(AlarmManager.OnAlarmListener onAlarmListener) {
                    this.A00.cancel(onAlarmListener);
                }

                @Override // android.app.AlarmManager
                public void cancel(PendingIntent pendingIntent) {
                    this.A00.cancel(pendingIntent);
                }

                @Override // android.app.AlarmManager
                public AlarmManager.AlarmClockInfo getNextAlarmClock() {
                    return this.A00.getNextAlarmClock();
                }

                @Override // android.app.AlarmManager
                public void set(int i, long j, PendingIntent pendingIntent) {
                    int i2 = 0;
                    do {
                        try {
                            this.A00.set(i, (i2 * 10) + j, pendingIntent);
                            return;
                        } catch (NullPointerException | SecurityException e) {
                            if (!A00(e)) {
                                throw e;
                            }
                            i2++;
                            if (i2 >= 3) {
                            }
                        }
                    } while (i2 >= 3);
                }

                @Override // android.app.AlarmManager
                public void set(int i, long j, String str, AlarmManager.OnAlarmListener onAlarmListener, Handler handler) {
                    int i2 = 0;
                    do {
                        try {
                            this.A00.set(i, j, str, onAlarmListener, handler);
                            return;
                        } catch (NullPointerException | SecurityException e) {
                            if (!A00(e)) {
                                throw e;
                            }
                            i2++;
                            if (i2 >= 3) {
                            }
                        }
                    } while (i2 >= 3);
                }

                @Override // android.app.AlarmManager
                public void setAlarmClock(AlarmManager.AlarmClockInfo alarmClockInfo, PendingIntent pendingIntent) {
                    this.A00.setAlarmClock(alarmClockInfo, pendingIntent);
                }

                @Override // android.app.AlarmManager
                public void setAndAllowWhileIdle(int i, long j, PendingIntent pendingIntent) {
                    this.A00.setAndAllowWhileIdle(i, j, pendingIntent);
                }

                @Override // android.app.AlarmManager
                public void setExact(int i, long j, PendingIntent pendingIntent) {
                    this.A00.setExact(i, j, pendingIntent);
                }

                @Override // android.app.AlarmManager
                public void setExact(int i, long j, String str, AlarmManager.OnAlarmListener onAlarmListener, Handler handler) {
                    this.A00.setExact(i, j, str, onAlarmListener, handler);
                }

                @Override // android.app.AlarmManager
                public void setExactAndAllowWhileIdle(int i, long j, PendingIntent pendingIntent) {
                    int i2 = 0;
                    do {
                        try {
                            this.A00.setExactAndAllowWhileIdle(i, (i2 * 10) + j, pendingIntent);
                            return;
                        } catch (NullPointerException | SecurityException e) {
                            if (!A00(e)) {
                                throw e;
                            }
                            i2++;
                            if (i2 >= 3) {
                            }
                        }
                    } while (i2 >= 3);
                }

                @Override // android.app.AlarmManager
                public void setInexactRepeating(int i, long j, long j2, PendingIntent pendingIntent) {
                    int i2 = 0;
                    do {
                        try {
                            this.A00.setInexactRepeating(i, j, j2, pendingIntent);
                            return;
                        } catch (NullPointerException | SecurityException e) {
                            if (!A00(e)) {
                                throw e;
                            }
                            i2++;
                            if (i2 >= 3) {
                            }
                        }
                    } while (i2 >= 3);
                }

                @Override // android.app.AlarmManager
                public void setRepeating(int i, long j, long j2, PendingIntent pendingIntent) {
                    this.A00.setRepeating(i, j, j2, pendingIntent);
                }

                @Override // android.app.AlarmManager
                public void setTime(long j) {
                    this.A00.setTime(j);
                }

                @Override // android.app.AlarmManager
                public void setTimeZone(String str) {
                    this.A00.setTimeZone(str);
                }

                @Override // android.app.AlarmManager
                public void setWindow(int i, long j, long j2, PendingIntent pendingIntent) {
                    this.A00.setWindow(i, j, j2, pendingIntent);
                }

                @Override // android.app.AlarmManager
                public void setWindow(int i, long j, long j2, String str, AlarmManager.OnAlarmListener onAlarmListener, Handler handler) {
                    this.A00.setWindow(i, j, j2, str, onAlarmListener, handler);
                }
            };
            this.A02 = r1;
            return r1;
        }
        return anonymousClass033;
    }

    public KeyguardManager A04() {
        KeyguardManager keyguardManager = this.A01;
        if (keyguardManager == null) {
            KeyguardManager keyguardManager2 = (KeyguardManager) this.A0H.A00.getSystemService("keyguard");
            this.A01 = keyguardManager2;
            return keyguardManager2;
        }
        return keyguardManager;
    }

    public UsageStatsManager A05() {
        UsageStatsManager usageStatsManager = this.A03;
        if (usageStatsManager == null) {
            UsageStatsManager usageStatsManager2 = (UsageStatsManager) this.A0H.A00.getSystemService("usagestats");
            this.A03 = usageStatsManager2;
            return usageStatsManager2;
        }
        return usageStatsManager;
    }

    public ClipboardManager A06() {
        ClipboardManager clipboardManager = this.A04;
        if (clipboardManager == null) {
            ClipboardManager clipboardManager2 = (ClipboardManager) this.A0H.A00.getSystemService("clipboard");
            this.A04 = clipboardManager2;
            return clipboardManager2;
        }
        return clipboardManager;
    }

    public ContentResolver A07() {
        ContentResolver contentResolver = this.A05;
        if (contentResolver == null) {
            ContentResolver contentResolver2 = this.A0H.A00.getContentResolver();
            this.A05 = contentResolver2;
            return contentResolver2;
        }
        return contentResolver;
    }

    public SensorManager A08() {
        SensorManager sensorManager = this.A06;
        if (sensorManager == null) {
            SensorManager sensorManager2 = (SensorManager) this.A0H.A00.getSystemService("sensor");
            this.A06 = sensorManager2;
            return sensorManager2;
        }
        return sensorManager;
    }

    public LocationManager A09() {
        LocationManager locationManager = this.A07;
        if (locationManager == null) {
            LocationManager locationManager2 = (LocationManager) this.A0H.A00.getSystemService("location");
            this.A07 = locationManager2;
            return locationManager2;
        }
        return locationManager;
    }

    public AudioManager A0A() {
        return (AudioManager) this.A0H.A00.getSystemService("audio");
    }

    public ConnectivityManager A0B() {
        ConnectivityManager connectivityManager = this.A08;
        if (connectivityManager == null) {
            ConnectivityManager connectivityManager2 = (ConnectivityManager) this.A0H.A00.getSystemService("connectivity");
            this.A08 = connectivityManager2;
            return connectivityManager2;
        }
        return connectivityManager;
    }

    public WifiManager A0C() {
        WifiManager wifiManager = this.A09;
        if (wifiManager == null) {
            WifiManager wifiManager2 = (WifiManager) this.A0H.A00.getSystemService("wifi");
            this.A09 = wifiManager2;
            return wifiManager2;
        }
        return wifiManager;
    }

    public PowerManager A0D() {
        PowerManager powerManager = this.A0A;
        if (powerManager == null) {
            PowerManager powerManager2 = (PowerManager) this.A0H.A00.getSystemService("power");
            this.A0A = powerManager2;
            return powerManager2;
        }
        return powerManager;
    }

    public TelecomManager A0E() {
        TelecomManager telecomManager = this.A0C;
        if (telecomManager == null) {
            TelecomManager telecomManager2 = (TelecomManager) this.A0H.A00.getSystemService("telecom");
            this.A0C = telecomManager2;
            return telecomManager2;
        }
        return telecomManager;
    }

    public SubscriptionManager A0F() {
        SubscriptionManager subscriptionManager = this.A0D;
        if (subscriptionManager == null) {
            SubscriptionManager subscriptionManager2 = (SubscriptionManager) this.A0H.A00.getSystemService("telephony_subscription_service");
            this.A0D = subscriptionManager2;
            return subscriptionManager2;
        }
        return subscriptionManager;
    }

    public TelephonyManager A0G() {
        TelephonyManager telephonyManager = this.A0E;
        if (telephonyManager == null) {
            TelephonyManager telephonyManager2 = (TelephonyManager) this.A0H.A00.getSystemService("phone");
            this.A0E = telephonyManager2;
            return telephonyManager2;
        }
        return telephonyManager;
    }

    public AccessibilityManager A0H() {
        AccessibilityManager accessibilityManager = this.A0F;
        if (accessibilityManager == null) {
            AccessibilityManager accessibilityManager2 = (AccessibilityManager) this.A0H.A00.getSystemService("accessibility");
            this.A0F = accessibilityManager2;
            return accessibilityManager2;
        }
        return accessibilityManager;
    }

    public InputMethodManager A0I() {
        InputMethodManager inputMethodManager = this.A0G;
        if (inputMethodManager == null) {
            InputMethodManager inputMethodManager2 = (InputMethodManager) this.A0H.A00.getSystemService("input_method");
            this.A0G = inputMethodManager2;
            return inputMethodManager2;
        }
        return inputMethodManager;
    }
}

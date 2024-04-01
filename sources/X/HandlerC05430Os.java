package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.Statistics$Data;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;

/* renamed from: X.0Os  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class HandlerC05430Os extends Handler implements InterfaceC001000m {
    public Statistics$Data A00;
    public File A01;
    public File A02;
    public final CountDownLatch A03;
    public volatile boolean A04;
    public final /* synthetic */ C0EL A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC05430Os(C0EL c0el, Looper looper, C000800k c000800k) {
        super(looper);
        this.A05 = c0el;
        this.A03 = new CountDownLatch(1);
        c000800k.A01(this);
    }

    public final void A00() {
        C0EL c0el = this.A05;
        if (!c0el.A06.A0C(403) && !this.A01.exists()) {
            File file = this.A02;
            if (file != null) {
                try {
                    C02D c02d = new C02D(c0el.A03.A04, file);
                    try {
                        new ObjectOutputStream(c02d).writeObject(this.A00);
                        c02d.close();
                    } finally {
                    }
                } catch (IOException e) {
                    Log.e("statistics/saveOld: error saving", e);
                    AbstractC000600i abstractC000600i = c0el.A01;
                    StringBuilder A0P = C000200d.A0P("old; ");
                    A0P.append(e.toString());
                    abstractC000600i.A09("statistics/data-save-error", A0P.toString(), false);
                }
            } else {
                throw null;
            }
        } else {
            File file2 = this.A01;
            if (file2 != null) {
                try {
                    C02D c02d2 = new C02D(c0el.A03.A04, file2);
                    c02d2.A03.write(this.A00.A00().getBytes());
                    c02d2.close();
                    this.A02.delete();
                    return;
                } catch (Exception e2) {
                    Log.e("statistics/saveNew: error saving", e2);
                    AbstractC000600i abstractC000600i2 = c0el.A01;
                    StringBuilder A0P2 = C000200d.A0P("new; ");
                    A0P2.append(e2.toString());
                    abstractC000600i2.A09("statistics/data-save-error", A0P2.toString(), false);
                    return;
                }
            }
            throw null;
        }
    }

    public final void A01(int i, long j) {
        if (this.A04) {
            this.A00.rx_roaming_bytes += j;
        }
        if (i == 0) {
            this.A00.rx_media_bytes += j;
        } else if (i == 1) {
            this.A00.rx_message_service_bytes += j;
        } else if (i == 2) {
            this.A00.rx_voip_bytes += j;
        } else if (i == 3) {
            this.A00.rx_google_drive_bytes += j;
        } else if (i == 4) {
            this.A00.rx_status_bytes += j;
        }
    }

    public final void A02(int i, long j) {
        if (this.A04) {
            this.A00.tx_roaming_bytes += j;
        }
        if (i == 0) {
            this.A00.tx_media_bytes += j;
        } else if (i == 1) {
            this.A00.tx_message_service_bytes += j;
        } else if (i == 2) {
            this.A00.tx_voip_bytes += j;
        } else if (i == 3) {
            this.A00.tx_google_drive_bytes += j;
        } else if (i == 4) {
            this.A00.tx_status_bytes += j;
        }
    }

    @Override // X.InterfaceC001000m
    public void AIx(C05050Nc c05050Nc) {
        this.A04 = c05050Nc.A03;
    }

    /* JADX WARN: Finally extract failed */
    @Override // android.os.Handler
    public synchronized void handleMessage(Message message) {
        Statistics$Data statistics$Data;
        switch (message.what) {
            case 0:
                C0EL c0el = this.A05;
                C001200o c001200o = c0el.A05;
                this.A02 = new File(c001200o.A00.getFilesDir(), "statistics");
                File file = new File(c001200o.A00.getFilesDir(), "statistics.json");
                this.A01 = file;
                if (file.exists()) {
                    if (this.A01.exists()) {
                        try {
                            statistics$Data = new Statistics$Data(new JSONObject(new String(AnonymousClass024.A0n(this.A01))));
                        } catch (Exception e) {
                            Log.w("statistics/loadNew: reset due to the error", e);
                            AbstractC000600i abstractC000600i = c0el.A01;
                            StringBuilder A0P = C000200d.A0P("new; ");
                            A0P.append(e.toString());
                            abstractC000600i.A09("statistics/data-load-error", A0P.toString(), false);
                            statistics$Data = new Statistics$Data(true);
                        }
                    } else {
                        statistics$Data = new Statistics$Data(false);
                    }
                    this.A00 = statistics$Data;
                    this.A03.countDown();
                    StringBuilder sb = new StringBuilder();
                    sb.append("statistics/init: ");
                    sb.append(this.A00.toString());
                    Log.i(sb.toString());
                    break;
                } else {
                    if (this.A02.exists()) {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(this.A02);
                            try {
                                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                                statistics$Data = (Statistics$Data) objectInputStream.readObject();
                                objectInputStream.close();
                                fileInputStream.close();
                            } finally {
                            }
                        } catch (Exception e2) {
                            Log.w("statistics/loadOld: reset due to the error", e2);
                            AbstractC000600i abstractC000600i2 = c0el.A01;
                            StringBuilder A0P2 = C000200d.A0P("old; ");
                            A0P2.append(e2.toString());
                            abstractC000600i2.A09("statistics/data-load-error", A0P2.toString(), false);
                            statistics$Data = new Statistics$Data(true);
                        }
                    } else {
                        statistics$Data = new Statistics$Data(false);
                    }
                    this.A00 = statistics$Data;
                    this.A03.countDown();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("statistics/init: ");
                    sb2.append(this.A00.toString());
                    Log.i(sb2.toString());
                }
            case 1:
                A00();
                break;
            case 2:
                A02(message.arg1, message.arg2);
                break;
            case 3:
                A01(message.arg1, message.arg2);
                break;
            case 4:
                A02(message.arg1, message.getData().getLong("bytes"));
                break;
            case 5:
                A01(message.arg1, message.getData().getLong("bytes"));
                break;
            case 6:
                int i = message.arg1;
                boolean z = message.arg2 == 1;
                if (i == 3) {
                    this.A00.tx_statuses++;
                } else if (i == 1) {
                    this.A00.tx_text_msgs++;
                } else if (i == 2) {
                    this.A00.tx_media_msgs++;
                }
                if (z) {
                    this.A00.tx_payment_msgs++;
                    break;
                }
                break;
            case 7:
                Bundle data = message.getData();
                int i2 = data.getInt("messageType");
                long j = data.getLong("timestamp");
                boolean z2 = data.getBoolean("isPayment");
                long A05 = this.A05.A04.A05() - j;
                if (A05 > 1000) {
                    Statistics$Data statistics$Data2 = this.A00;
                    long j2 = statistics$Data2.rx_offline_delay;
                    long j3 = statistics$Data2.rx_offline_msgs;
                    long j4 = j3 + 1;
                    statistics$Data2.rx_offline_msgs = j4;
                    statistics$Data2.rx_offline_delay = ((j2 * j3) + A05) / j4;
                }
                if (i2 == 3) {
                    this.A00.rx_statuses++;
                } else if (i2 == 1) {
                    this.A00.rx_text_msgs++;
                } else if (i2 == 2) {
                    this.A00.rx_media_msgs++;
                }
                if (z2) {
                    this.A00.rx_payment_msgs++;
                    break;
                }
                break;
            case 8:
                if (message.arg1 == 1) {
                    this.A00.tx_voip_calls++;
                    break;
                } else {
                    this.A00.rx_voip_calls++;
                    break;
                }
            case 9:
                this.A00 = new Statistics$Data(true);
                A00();
                break;
            default:
                StringBuilder sb3 = new StringBuilder();
                sb3.append("statistics/stats-handler:unknown message:");
                sb3.append(message);
                Log.e(sb3.toString());
                break;
        }
    }
}

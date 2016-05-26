package com.example.moham.buzzletask;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ImageView i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16;
    ImageView n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16;
    FrameLayout f1, f2, f3, f4, f5, f6, f7, f8, f9, f11, f12, f13, f14, f15, f16, f10;
    ArrayList<Drawable> arrayDrawable = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i1 = (ImageView) findViewById(R.id.i1);
        n1 = (ImageView) findViewById(R.id.n1);
        n2 = (ImageView) findViewById(R.id.n2);
        n3 = (ImageView) findViewById(R.id.n3);
        n4 = (ImageView) findViewById(R.id.n4);
        n5 = (ImageView) findViewById(R.id.n5);
        n6 = (ImageView) findViewById(R.id.n6);
        n7 = (ImageView) findViewById(R.id.n7);
        n8 = (ImageView) findViewById(R.id.n8);
        n9 = (ImageView) findViewById(R.id.n9);
        n10 = (ImageView) findViewById(R.id.n10);
        n11 = (ImageView) findViewById(R.id.n11);
        n12 = (ImageView) findViewById(R.id.n12);
        n13 = (ImageView) findViewById(R.id.n13);
        n14 = (ImageView) findViewById(R.id.n14);
        n15 = (ImageView) findViewById(R.id.n15);
        n16 = (ImageView) findViewById(R.id.n16);
        f1 = (FrameLayout) findViewById(R.id.f1);
        f2 = (FrameLayout) findViewById(R.id.f2);
        f3 = (FrameLayout) findViewById(R.id.f3);
        f4 = (FrameLayout) findViewById(R.id.f4);
        f5 = (FrameLayout) findViewById(R.id.f5);
        f6 = (FrameLayout) findViewById(R.id.f6);
        f7 = (FrameLayout) findViewById(R.id.f7);
        f8 = (FrameLayout) findViewById(R.id.f8);
        f9 = (FrameLayout) findViewById(R.id.f9);
        f11 = (FrameLayout) findViewById(R.id.f11);
        f12 = (FrameLayout) findViewById(R.id.f12);
        f13 = (FrameLayout) findViewById(R.id.f13);
        f14 = (FrameLayout) findViewById(R.id.f14);
        f15 = (FrameLayout) findViewById(R.id.f15);
        f16 = (FrameLayout) findViewById(R.id.f16);
        f10 = (FrameLayout) findViewById(R.id.f10);

        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "1", Toast.LENGTH_SHORT).show();
                f1.removeView(n1);
                ImageView vi = (ImageView) f1.getChildAt(0);
                Toast.makeText(MainActivity.this, vi.getTag() + "", Toast.LENGTH_SHORT).show();
                if (arrayDrawable.size() % 2 == 0) {
                    arrayDrawable.add(vi.getDrawable());
                } else if (!IsHere(vi.getDrawable())) {
                    f1.addView(n1);
                    Toast.makeText(MainActivity.this, "3", Toast.LENGTH_SHORT).show();
                }
            }
        });
        f2.setOnClickListener(new View.OnClickListener()

                              {
                                  @Override
                                  public void onClick(View v) {
                                      f2.removeView(n2);
                                      Toast.makeText(MainActivity.this, "removing", Toast.LENGTH_SHORT).show();
                                      ImageView vi = (ImageView) f2.getChildAt(0);
                                      if (arrayDrawable.size() % 2 == 0) {
                                          arrayDrawable.add(vi.getDrawable());
                                      } else if (!IsHere(vi.getDrawable())) {
                                          Toast.makeText(MainActivity.this, "f", Toast.LENGTH_SHORT).show();
                                          f2.addView(n2);
                                      }
                                  }
                              }

        );

        f3.setOnClickListener(new View.OnClickListener()

                              {
                                  @Override
                                  public void onClick(View v) {
                                      f3.removeView(n3);
                                      ImageView vi = (ImageView) f3.getChildAt(0);
                                      if (arrayDrawable.size() % 2 == 0) {
                                          arrayDrawable.add(vi.getDrawable());
                                      } else if (!IsHere(vi.getDrawable())) {
                                          f3.addView(n3);
                                      }
                                  }
                              }

        );

        f4.setOnClickListener(new View.OnClickListener()

                              {
                                  @Override
                                  public void onClick(View v) {

                                      f4.removeView(n4);
                                      ImageView vi = (ImageView) f4.getChildAt(0);
                                      if (arrayDrawable.size() % 2 == 0) {
                                          arrayDrawable.add(vi.getDrawable());
                                      } else if (!IsHere(vi.getDrawable())) {
                                          f4.addView(n4);
                                      }
                                  }
                              }

        );

        f5.setOnClickListener(new View.OnClickListener()

                              {
                                  @Override
                                  public void onClick(View v) {
                                      f5.removeView(n5);
                                      ImageView vi = (ImageView) f5.getChildAt(0);
                                      if (arrayDrawable.size() % 2 == 0) {
                                          arrayDrawable.add(vi.getDrawable());
                                      } else if (!IsHere(vi.getDrawable())) {
                                          f5.addView(n5);
                                      }

                                  }
                              }

        );

        f6.setOnClickListener(new View.OnClickListener()

                              {
                                  @Override
                                  public void onClick(View v) {
                                      f6.removeView(n6);
                                      ImageView vi = (ImageView) f6.getChildAt(0);
                                      if (arrayDrawable.size() % 2 == 0) {
                                          arrayDrawable.add(vi.getDrawable());
                                      } else if (!IsHere(vi.getDrawable())) {
                                          f6.addView(n6);
                                      }
                                  }
                              }

        );

        f7.setOnClickListener(new View.OnClickListener()

                              {
                                  @Override
                                  public void onClick(View v) {
                                      f7.removeView(n7);
                                      ImageView vi = (ImageView) f7.getChildAt(0);
                                      Toast.makeText(MainActivity.this, vi.getTag() + "", Toast.LENGTH_SHORT).show();
                                      if (arrayDrawable.size() % 2 == 0) {
                                          arrayDrawable.add(vi.getDrawable());
                                      } else if (!IsHere(vi.getDrawable())) {
                                          Toast.makeText(MainActivity.this, "T", Toast.LENGTH_SHORT).show();
                                          f7.addView(n7);
                                      }


                                  }
                              }

        );

        f8.setOnClickListener(new View.OnClickListener()

                              {
                                  @Override
                                  public void onClick(View v) {

                                      f8.removeView(n8);
                                      ImageView vi = (ImageView) f8.getChildAt(0);
                                      if (arrayDrawable.size() % 2 == 0) {
                                          arrayDrawable.add(vi.getDrawable());
                                      } else if (!IsHere(vi.getDrawable())) {
                                          f8.addView(n8);
                                      }

                                  }
                              }

        );

        f9.setOnClickListener(new View.OnClickListener()

                              {
                                  @Override
                                  public void onClick(View v) {
                                      f9.removeView(n9);
                                      ImageView vi = (ImageView) f9.getChildAt(0);
                                      Toast.makeText(MainActivity.this, vi.getTag()+"", Toast.LENGTH_SHORT).show();
                                      if (arrayDrawable.size() % 2 == 0) {
                                          arrayDrawable.add(vi.getDrawable());
                                      } else if (!IsHere(vi.getDrawable())) {
                                          f9.addView(n9);
                                          Toast.makeText(MainActivity.this, "T", Toast.LENGTH_SHORT).show();

                                      }
                                  }
                              }

        );
        f10.setOnClickListener(new View.OnClickListener()

                               {
                                   @Override
                                   public void onClick(View v) {

                                       f10.removeView(n10);
                                       ImageView vi = (ImageView) f10.getChildAt(0);
                                       if (arrayDrawable.size() % 2 == 0) {
                                           arrayDrawable.add(vi.getDrawable());
                                       } else if (!IsHere(vi.getDrawable())) {
                                           f10.addView(n10);
                                       }

                                   }
                               }

        );
        f11.setOnClickListener(new View.OnClickListener()

                               {
                                   @Override
                                   public void onClick(View v) {

                                       f11.removeView(n11);
                                       ImageView vi = (ImageView) f11.getChildAt(0);
                                       if (arrayDrawable.size() % 2 == 0) {
                                           arrayDrawable.add(vi.getDrawable());
                                       } else if (!IsHere(vi.getDrawable())) {
                                           f11.addView(n11);
                                       }


                                   }
                               }

        );
        f12.setOnClickListener(new View.OnClickListener()

                               {
                                   @Override
                                   public void onClick(View v) {
                                       f12.removeView(n12);
                                       ImageView vi = (ImageView) f12.getChildAt(0);
                                       if (arrayDrawable.size() % 2 == 0) {
                                           arrayDrawable.add(vi.getDrawable());
                                       } else if (!IsHere(vi.getDrawable())) {
                                           f12.addView(n12);
                                       }

                                   }
                               }

        );
        f13.setOnClickListener(new View.OnClickListener()

                               {
                                   @Override
                                   public void onClick(View v) {
                                       f13.removeView(n13);
                                       ImageView vi = (ImageView) f13.getChildAt(0);
                                       if (arrayDrawable.size() % 2 == 0) {
                                           arrayDrawable.add(vi.getDrawable());
                                       } else if (!IsHere(vi.getDrawable())) {
                                           f13.addView(n13);
                                       }
                                   }
                               }

        );
        f14.setOnClickListener(new View.OnClickListener()

                               {
                                   @Override
                                   public void onClick(View v) {

                                       f14.removeView(n14);
                                       ImageView vi = (ImageView) f14.getChildAt(0);
                                       if (arrayDrawable.size() % 2 == 0) {
                                           arrayDrawable.add(vi.getDrawable());
                                       } else if (!IsHere(vi.getDrawable())) {
                                           f14.addView(n14);
                                       }

                                   }
                               }

        );
        f15.setOnClickListener(new View.OnClickListener()

                               {
                                   @Override
                                   public void onClick(View v) {

                                       f15.removeView(n15);
                                       ImageView vi = (ImageView) f15.getChildAt(0);
                                       if (arrayDrawable.size() % 2 == 0) {
                                           arrayDrawable.add(vi.getDrawable());
                                       } else if (!IsHere(vi.getDrawable())) {
                                           f15.addView(n15);
                                       }

                                   }
                               }

        );
        f16.setOnClickListener(new View.OnClickListener()

                               {
                                   @Override
                                   public void onClick(View v) {

                                       f16.removeView(n16);
                                       ImageView vi = (ImageView) f16.getChildAt(0);
                                       if (arrayDrawable.size() % 2 == 0) {
                                           arrayDrawable.add(vi.getDrawable());
                                       } else if (!IsHere(vi.getDrawable())) {
                                           f16.addView(n16);
                                       }
                                   }
                               }

        );

    }

    boolean IsHere(Drawable d) {
        for (int i = 0; i < arrayDrawable.size(); i++) {
            if (arrayDrawable.get(i) == d) {
                Toast.makeText(MainActivity.this, "2", Toast.LENGTH_SHORT).show();
                return true;
            }
        }
        return false;
    }

}
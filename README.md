![alt tag](https://cloud.githubusercontent.com/assets/4988279/13100167/9070909a-d56c-11e5-80e4-e9aa36008ab5.gif)

**USAGE**
- Add dependencies for doubletap
```
compile 'com.thestarclubz:doubletap:0.9.3'
```

**CODE EXAMPLE**
```
   button.setOnTouchListener(new OnDoubleTapListener(context) {
  
              @Override
              public void onDoubleTap(MotionEvent e) {
                  // Double here
              }
  
              @Override
              public void onSingleTapConfirmed(MotionEvent e) {
                  // Single here
              }
          });
```

**DEVELOP BY**
```
   party -- thestarclub.party@gmail.com
```

**LICENSE**


    Copyright 2016 thestarclubz

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

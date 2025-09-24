import { WebPlugin } from '@capacitor/core';

import type { PictureInPicturePlugin } from './definitions';

export class PictureInPictureWeb extends WebPlugin implements PictureInPicturePlugin {
  isPiPAvailable(): Promise<{ available: boolean; }> {
    throw new Error('Method not implemented.');
  }
  isPipEnable(): Promise<{ enable: boolean; }> {
    throw new Error('Method not implemented.');
  }
  startPiPMode(): Promise<{ success: boolean; }> {
    throw new Error('Method not implemented.');
  }
  openSettings(): Promise<void> {
    throw new Error('Method not implemented.');
  }
}

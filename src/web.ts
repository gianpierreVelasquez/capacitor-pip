import { WebPlugin } from '@capacitor/core';

import type { PictureInPicturePlugin, IStatus } from './definitions';

export class PictureInPictureWeb extends WebPlugin implements PictureInPicturePlugin {
  isPiPAvailable(): Promise<IStatus> {
    throw new Error('Method not implemented.');
  }

  startPiPMode(): Promise<{ success: boolean; }> {
    throw new Error('Method not implemented.');
  }
}

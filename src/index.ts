import { registerPlugin } from '@capacitor/core';

import type { PictureInPicturePlugin } from './definitions';

const PiP = registerPlugin<PictureInPicturePlugin>('PiP', {
  web: import('./web').then(m => new m.PictureInPictureWeb()),
});

export * from './definitions';
export { PiP };
